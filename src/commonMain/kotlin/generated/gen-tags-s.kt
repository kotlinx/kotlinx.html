package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class SAMP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("samp", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val SAMP.asFlowContent : FlowContent
    get()  = this

val SAMP.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class SCRIPT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("script", consumer, initialAttributes, null, false, false), FlowMetaDataPhrasingContent {
    var charset : String
        get()  = attributeStringString.get(this, "charset")
        set(newValue) {attributeStringString.set(this, "charset", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var defer : Boolean
        get()  = attributeBooleanTicker.get(this, "defer")
        set(newValue) {attributeBooleanTicker.set(this, "defer", newValue)}

    var async : Boolean
        get()  = attributeBooleanTicker.get(this, "async")
        set(newValue) {attributeBooleanTicker.set(this, "async", newValue)}

    var nonce : String
        get()  = attributeStringString.get(this, "nonce")
        set(newValue) {attributeStringString.set(this, "nonce", newValue)}

    var integrity : String
        get()  = attributeStringString.get(this, "integrity")
        set(newValue) {attributeStringString.set(this, "integrity", newValue)}

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun Entities.unaryPlus() : Unit {
        @Suppress("DEPRECATION") entity(this)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun String.unaryPlus() : Unit {
        @Suppress("DEPRECATION") text(this)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(s : String) : Unit {
        super<HTMLTag>.text(s)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(n : Number) : Unit {
        super<HTMLTag>.text(n)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun entity(e : Entities) : Unit {
        super<HTMLTag>.entity(e)
    }

}
val SCRIPT.asFlowContent : FlowContent
    get()  = this

val SCRIPT.asMetaDataContent : MetaDataContent
    get()  = this

val SCRIPT.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class SECTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("section", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {

}
val SECTION.asFlowContent : FlowContent
    get()  = this

val SECTION.asSectioningContent : SectioningContent
    get()  = this


@Suppress("unused")
open class SELECT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("select", consumer, initialAttributes, null, true, false), CommonAttributeGroupFacadeFlowInteractivePhrasingContent {
    var autoFocus : Boolean
        get()  = attributeBooleanTicker.get(this, "autofocus")
        set(newValue) {attributeBooleanTicker.set(this, "autofocus", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var multiple : Boolean
        get()  = attributeBooleanTicker.get(this, "multiple")
        set(newValue) {attributeBooleanTicker.set(this, "multiple", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var size : String
        get()  = attributeStringString.get(this, "size")
        set(newValue) {attributeStringString.set(this, "size", newValue)}

    var required : Boolean
        get()  = attributeBooleanTicker.get(this, "required")
        set(newValue) {attributeBooleanTicker.set(this, "required", newValue)}


}
/**
 * Selectable choice
 */
@HtmlTagMarker
inline fun SELECT.option(classes : String? = null, crossinline block : OPTION.() -> Unit = {}) : Unit = OPTION(attributesMapOf("class", classes), consumer).visit(block)
/**
 * Selectable choice
 */
@HtmlTagMarker
fun SELECT.option(classes : String? = null, content : String = "") : Unit = OPTION(attributesMapOf("class", classes), consumer).visit({+content})

/**
 * Option group
 */
@HtmlTagMarker
inline fun SELECT.optGroup(label : String? = null, classes : String? = null, crossinline block : OPTGROUP.() -> Unit = {}) : Unit = OPTGROUP(attributesMapOf("label", label,"class", classes), consumer).visit(block)

val SELECT.asFlowContent : FlowContent
    get()  = this

val SELECT.asInteractiveContent : InteractiveContent
    get()  = this

val SELECT.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class SLOT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("slot", consumer, initialAttributes, null, false, false), HtmlInlineTag {
    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}


}

@Suppress("unused")
open class SMALL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("small", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val SMALL.asFlowContent : FlowContent
    get()  = this

val SMALL.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class SOURCE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("source", consumer, initialAttributes, null, true, true), CommonAttributeGroupFacade {
    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}


}

@Suppress("unused")
open class SPAN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("span", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val SPAN.asFlowContent : FlowContent
    get()  = this

val SPAN.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class STRONG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("strong", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val STRONG.asFlowContent : FlowContent
    get()  = this

val STRONG.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class STYLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("style", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowMetaDataContent {
    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}

    var scoped : Boolean
        get()  = attributeBooleanTicker.get(this, "scoped")
        set(newValue) {attributeBooleanTicker.set(this, "scoped", newValue)}

    var nonce : String
        get()  = attributeStringString.get(this, "nonce")
        set(newValue) {attributeStringString.set(this, "nonce", newValue)}

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun Entities.unaryPlus() : Unit {
        @Suppress("DEPRECATION") entity(this)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun String.unaryPlus() : Unit {
        @Suppress("DEPRECATION") text(this)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(s : String) : Unit {
        super<HTMLTag>.text(s)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(n : Number) : Unit {
        super<HTMLTag>.text(n)
    }

    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun entity(e : Entities) : Unit {
        super<HTMLTag>.entity(e)
    }

}
val STYLE.asFlowContent : FlowContent
    get()  = this

val STYLE.asMetaDataContent : MetaDataContent
    get()  = this


@Suppress("unused")
open class SUB(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sub", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val SUB.asFlowContent : FlowContent
    get()  = this

val SUB.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class SUMMARY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("summary", consumer, initialAttributes, null, true, false), CommonAttributeGroupFacadeFlowHeadingPhrasingContent {

}

@Suppress("unused")
open class SUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sup", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val SUP.asFlowContent : FlowContent
    get()  = this

val SUP.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class SVG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("svg", consumer, initialAttributes, "http://www.w3.org/2000/svg", false, false), HtmlBlockInlineTag {

}
val SVG.asFlowContent : FlowContent
    get()  = this

val SVG.asPhrasingContent : PhrasingContent
    get()  = this


