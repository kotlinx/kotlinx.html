package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class EM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("em", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class EMBED(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("embed", consumer, initialAttributes), CommonAttributeGroupFacade {
    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var height : String
        get()  = attributeStringString.get(this, "height")
        set(newValue) {attributeStringString.set(this, "height", newValue)}

    var width : String
        get()  = attributeStringString.get(this, "width")
        set(newValue) {attributeStringString.set(this, "width", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}


}

