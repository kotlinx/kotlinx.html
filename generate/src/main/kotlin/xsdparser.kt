package html4k.generate

import com.sun.xml.xsom.XSDeclaration
import com.sun.xml.xsom.XSParticle
import com.sun.xml.xsom.XSTerm
import com.sun.xml.xsom.parser.XSOMParser
import java.util.ArrayList
import java.util.HashSet

val SCHEME_URL = "generate/src/main/resources/html_5.xsd"
val HTML_NAMESPACE = "html-5"

private val attributeNamesMap = mapOf("class" to "classes")

private fun flattenTerm(term : XSTerm, result : ArrayList<String>) {
    if (term.isElementDecl()) {
        result.add(term.asElementDecl().getName())
    } else if (term.isModelGroupDecl()) {
        term.asModelGroupDecl().getModelGroup().toList().map {it.getTerm()}.forEach {
            flattenTerm(it, result)
        }
    } else if (term.isModelGroup()) {
        term.asModelGroup().toList().map {it.getTerm()}.forEach {
            flattenTerm(it, result)
        }
    }
}

fun fillRepository() {
    val parser = XSOMParser()
    parser.parse(SCHEME_URL)
    val schema = parser.getResult().getSchema(HTML_NAMESPACE)
    val suggestedNames = HashSet<String>(1024)
    schema.getAttGroupDecls().values().forEach { attributeGroup ->
        attributeGroup.getAttributeUses().forEach { attributeUse ->
            val attributeDeclaration = attributeUse.getDecl()
            val name = attributeDeclaration.getName()
            val type = attributeDeclaration.getType()

            if (attributeUse.isRequired()) {
                suggestedNames add name
            }

            val safeName = attributeNamesMap[name] ?: name.escapeUnsafeValues()
            val attributeInfo: AttributeInfo
            if (type.isUnion()) {
                attributeInfo = AttributeInfo(name, "String", safeName)
            } else if (type.isPrimitive()) {
                attributeInfo = AttributeInfo(name, xsdToType[type.getPrimitiveType().getName()] ?: "String", safeName)
            } else if (type.isRestriction()) {
                val restriction = type.asRestriction()
                val enumEntries = restriction.getDeclaredFacets().filter { it.getName() == "enumeration" }.map { it.getValue().value }

                if (enumEntries.size() == 1 && enumEntries.single() == name) {
                    // probably ticker
                    attributeInfo = AttributeInfo(name, "Boolean", safeName, trueFalse = listOf(name, "")) // TODO escape bad characters in name
                } else if (enumEntries.size() == 2 && enumEntries.sort() == listOf("off", "on")) {
                    attributeInfo = AttributeInfo(name, "Boolean", safeName, trueFalse = listOf("on", "off")) // TODO escape bad characters in name
                } else {
                    val enumTypeName = name.capitalize()
                    Repository.attributeEnums[enumTypeName] = enumEntries.toAttributeValues()

                    attributeInfo = AttributeInfo(name, enumTypeName, safeName) // TODO escape bad characters in name
                }
            } else {
                attributeInfo = AttributeInfo(name, "String", safeName)
            }

            Repository.attributes[name] = attributeInfo
        }
    }

    schema.getElementDecls().values().forEach { elementDeclaration ->
        val name = elementDeclaration.getName()
        val safeName = name.escapeUnsafeValues()
        val type = elementDeclaration.getType()

        val tagInfo : TagInfo
        if (type.isComplexType()) {
            val complex = type.asComplexType()
            val attributes = complex.getAttributeUses().map {it.getDecl().getName()}

            attributes.filter { it !in Repository.attributes }.forEach {
                // TODO add them too
                Repository.attributes[it] = AttributeInfo(it, "String", attributeNamesMap[it] ?: it.escapeUnsafeValues())
            }

            val children = ArrayList<String>()
            complex.getContentType().asParticle()?.let { particle ->
                flattenTerm(particle.getTerm(), children)
            }

            println("$name: $children")
            tagInfo = TagInfo(name, children, attributes, attributes.filter {it in suggestedNames})
        } else {
            throw UnsupportedOperationException()
        }

        if (name == safeName) {
            Repository.tags[name] = tagInfo
        }
    }
}

private val xsdToType = mapOf(
        "boolean" to "Boolean",
        "string" to "String",
        "anyURI" to "String" // TODO links
)