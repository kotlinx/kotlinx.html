package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public interface CommonAttributeGroupFacade : Tag {
    var runAt : RunAt
        get()  = attributeRunAtEnumRunAtValues.get(this, "runat")
        set(newValue) {attributeRunAtEnumRunAtValues.set(this, "runat", newValue)}

    var accessKey : String
        get()  = attributeStringString.get(this, "accesskey")
        set(newValue) {attributeStringString.set(this, "accesskey", newValue)}

    var classes : Set<String>
        get()  = attributeSetStringStringSet.get(this, "class")
        set(newValue) {attributeSetStringStringSet.set(this, "class", newValue)}

    var contentEditable : Boolean
        get()  = attributeBooleanBoolean.get(this, "contenteditable")
        set(newValue) {attributeBooleanBoolean.set(this, "contenteditable", newValue)}

    var contextMenu : String
        get()  = attributeStringString.get(this, "contextmenu")
        set(newValue) {attributeStringString.set(this, "contextmenu", newValue)}

    var dataFolderName : String
        get()  = attributeStringString.get(this, "data-FolderName")
        set(newValue) {attributeStringString.set(this, "data-FolderName", newValue)}

    var dataMsgId : String
        get()  = attributeStringString.get(this, "data-MsgId")
        set(newValue) {attributeStringString.set(this, "data-MsgId", newValue)}

    var dir : Dir
        get()  = attributeDirEnumDirValues.get(this, "dir")
        set(newValue) {attributeDirEnumDirValues.set(this, "dir", newValue)}

    var draggable : Draggable
        get()  = attributeDraggableEnumDraggableValues.get(this, "draggable")
        set(newValue) {attributeDraggableEnumDraggableValues.set(this, "draggable", newValue)}

    var id : String
        get()  = attributeStringString.get(this, "id")
        set(newValue) {attributeStringString.set(this, "id", newValue)}

    var item : String
        get()  = attributeStringString.get(this, "item")
        set(newValue) {attributeStringString.set(this, "item", newValue)}

    var hidden : Boolean
        get()  = attributeBooleanTicker.get(this, "hidden")
        set(newValue) {attributeBooleanTicker.set(this, "hidden", newValue)}

    var itemProp : String
        get()  = attributeStringString.get(this, "itemprop")
        set(newValue) {attributeStringString.set(this, "itemprop", newValue)}

    var role : String
        get()  = attributeStringString.get(this, "role")
        set(newValue) {attributeStringString.set(this, "role", newValue)}

    var spellCheck : Boolean
        get()  = attributeBooleanBoolean.get(this, "spellcheck")
        set(newValue) {attributeBooleanBoolean.set(this, "spellcheck", newValue)}

    var style : String
        get()  = attributeStringString.get(this, "style")
        set(newValue) {attributeStringString.set(this, "style", newValue)}

    var subject : String
        get()  = attributeStringString.get(this, "subject")
        set(newValue) {attributeStringString.set(this, "subject", newValue)}

    var tabIndex : String
        get()  = attributeStringString.get(this, "tabIndex")
        set(newValue) {attributeStringString.set(this, "tabIndex", newValue)}

    var title : String
        get()  = attributeStringString.get(this, "title")
        set(newValue) {attributeStringString.set(this, "title", newValue)}

    var enableTheming : Boolean
        get()  = attributeBooleanBoolean.get(this, "EnableTheming")
        set(newValue) {attributeBooleanBoolean.set(this, "EnableTheming", newValue)}

    var enableViewState : Boolean
        get()  = attributeBooleanBoolean.get(this, "EnableViewState")
        set(newValue) {attributeBooleanBoolean.set(this, "EnableViewState", newValue)}

    var skinID : String
        get()  = attributeStringString.get(this, "SkinID")
        set(newValue) {attributeStringString.set(this, "SkinID", newValue)}

    var visible : Boolean
        get()  = attributeBooleanBoolean.get(this, "Visible")
        set(newValue) {attributeBooleanBoolean.set(this, "Visible", newValue)}

    var onAbort : String
        get()  = attributeStringString.get(this, "onabort")
        set(newValue) {attributeStringString.set(this, "onabort", newValue)}

    var onBlur : String
        get()  = attributeStringString.get(this, "onblur")
        set(newValue) {attributeStringString.set(this, "onblur", newValue)}

    var onCanPlay : String
        get()  = attributeStringString.get(this, "oncanplay")
        set(newValue) {attributeStringString.set(this, "oncanplay", newValue)}

    var onCanPlayThrough : String
        get()  = attributeStringString.get(this, "oncanplaythrough")
        set(newValue) {attributeStringString.set(this, "oncanplaythrough", newValue)}

    var onChange : String
        get()  = attributeStringString.get(this, "onchange")
        set(newValue) {attributeStringString.set(this, "onchange", newValue)}

    var onClick : String
        get()  = attributeStringString.get(this, "onclick")
        set(newValue) {attributeStringString.set(this, "onclick", newValue)}

    var onContextMenu : String
        get()  = attributeStringString.get(this, "oncontextmenu")
        set(newValue) {attributeStringString.set(this, "oncontextmenu", newValue)}

    var onDoubleClick : String
        get()  = attributeStringString.get(this, "ondblclick")
        set(newValue) {attributeStringString.set(this, "ondblclick", newValue)}

    var onDrag : String
        get()  = attributeStringString.get(this, "ondrag")
        set(newValue) {attributeStringString.set(this, "ondrag", newValue)}

    var onDragEnter : String
        get()  = attributeStringString.get(this, "ondragenter")
        set(newValue) {attributeStringString.set(this, "ondragenter", newValue)}

    var onDragLeave : String
        get()  = attributeStringString.get(this, "ondragleave")
        set(newValue) {attributeStringString.set(this, "ondragleave", newValue)}

    var onDragOver : String
        get()  = attributeStringString.get(this, "ondragover")
        set(newValue) {attributeStringString.set(this, "ondragover", newValue)}

    var onDragStart : String
        get()  = attributeStringString.get(this, "ondragstart")
        set(newValue) {attributeStringString.set(this, "ondragstart", newValue)}

    var onDrop : String
        get()  = attributeStringString.get(this, "ondrop")
        set(newValue) {attributeStringString.set(this, "ondrop", newValue)}

    var onDurationChange : String
        get()  = attributeStringString.get(this, "ondurationchange")
        set(newValue) {attributeStringString.set(this, "ondurationchange", newValue)}

    var onEmptied : String
        get()  = attributeStringString.get(this, "onemptied")
        set(newValue) {attributeStringString.set(this, "onemptied", newValue)}

    var onEnded : String
        get()  = attributeStringString.get(this, "onended")
        set(newValue) {attributeStringString.set(this, "onended", newValue)}

    var onError : String
        get()  = attributeStringString.get(this, "onerror")
        set(newValue) {attributeStringString.set(this, "onerror", newValue)}

    var onFocus : String
        get()  = attributeStringString.get(this, "onfocus")
        set(newValue) {attributeStringString.set(this, "onfocus", newValue)}

    var onFormChange : String
        get()  = attributeStringString.get(this, "onformchange")
        set(newValue) {attributeStringString.set(this, "onformchange", newValue)}

    var onFormInput : String
        get()  = attributeStringString.get(this, "onforminput")
        set(newValue) {attributeStringString.set(this, "onforminput", newValue)}

    var onInput : String
        get()  = attributeStringString.get(this, "oninput")
        set(newValue) {attributeStringString.set(this, "oninput", newValue)}

    var onInvalid : String
        get()  = attributeStringString.get(this, "oninvalid")
        set(newValue) {attributeStringString.set(this, "oninvalid", newValue)}

    var onKeyDown : String
        get()  = attributeStringString.get(this, "onkeydown")
        set(newValue) {attributeStringString.set(this, "onkeydown", newValue)}

    var onKeyPress : String
        get()  = attributeStringString.get(this, "onkeypress")
        set(newValue) {attributeStringString.set(this, "onkeypress", newValue)}

    var onKeyUp : String
        get()  = attributeStringString.get(this, "onkeyup")
        set(newValue) {attributeStringString.set(this, "onkeyup", newValue)}

    var onLoad : String
        get()  = attributeStringString.get(this, "onload")
        set(newValue) {attributeStringString.set(this, "onload", newValue)}

    var onLoadedData : String
        get()  = attributeStringString.get(this, "onloadeddata")
        set(newValue) {attributeStringString.set(this, "onloadeddata", newValue)}

    var onLoadedMetaData : String
        get()  = attributeStringString.get(this, "onloadedmetadata")
        set(newValue) {attributeStringString.set(this, "onloadedmetadata", newValue)}

    var onLoadStart : String
        get()  = attributeStringString.get(this, "onloadstart")
        set(newValue) {attributeStringString.set(this, "onloadstart", newValue)}

    var onMouseDown : String
        get()  = attributeStringString.get(this, "onmousedown")
        set(newValue) {attributeStringString.set(this, "onmousedown", newValue)}

    var onMouseMove : String
        get()  = attributeStringString.get(this, "onmousemove")
        set(newValue) {attributeStringString.set(this, "onmousemove", newValue)}

    var onMouseOut : String
        get()  = attributeStringString.get(this, "onmouseout")
        set(newValue) {attributeStringString.set(this, "onmouseout", newValue)}

    var onMouseOver : String
        get()  = attributeStringString.get(this, "onmouseover")
        set(newValue) {attributeStringString.set(this, "onmouseover", newValue)}

    var onMouseUp : String
        get()  = attributeStringString.get(this, "onmouseup")
        set(newValue) {attributeStringString.set(this, "onmouseup", newValue)}

    var onMouseWheel : String
        get()  = attributeStringString.get(this, "onmousewheel")
        set(newValue) {attributeStringString.set(this, "onmousewheel", newValue)}

    var onPause : String
        get()  = attributeStringString.get(this, "onpause")
        set(newValue) {attributeStringString.set(this, "onpause", newValue)}

    var onPlay : String
        get()  = attributeStringString.get(this, "onplay")
        set(newValue) {attributeStringString.set(this, "onplay", newValue)}

    var onPlaying : String
        get()  = attributeStringString.get(this, "onplaying")
        set(newValue) {attributeStringString.set(this, "onplaying", newValue)}

    var onProgress : String
        get()  = attributeStringString.get(this, "onprogress")
        set(newValue) {attributeStringString.set(this, "onprogress", newValue)}

    var onRateChange : String
        get()  = attributeStringString.get(this, "onratechange")
        set(newValue) {attributeStringString.set(this, "onratechange", newValue)}

    var onReadyStateChange : String
        get()  = attributeStringString.get(this, "onreadystatechange")
        set(newValue) {attributeStringString.set(this, "onreadystatechange", newValue)}

    var onScroll : String
        get()  = attributeStringString.get(this, "onscroll")
        set(newValue) {attributeStringString.set(this, "onscroll", newValue)}

    var onSeeked : String
        get()  = attributeStringString.get(this, "onseeked")
        set(newValue) {attributeStringString.set(this, "onseeked", newValue)}

    var onSeeking : String
        get()  = attributeStringString.get(this, "onseeking")
        set(newValue) {attributeStringString.set(this, "onseeking", newValue)}

    var onSelect : String
        get()  = attributeStringString.get(this, "onselect")
        set(newValue) {attributeStringString.set(this, "onselect", newValue)}

    var onShow : String
        get()  = attributeStringString.get(this, "onshow")
        set(newValue) {attributeStringString.set(this, "onshow", newValue)}

    var onStalled : String
        get()  = attributeStringString.get(this, "onstalled")
        set(newValue) {attributeStringString.set(this, "onstalled", newValue)}

    var onSubmit : String
        get()  = attributeStringString.get(this, "onsubmit")
        set(newValue) {attributeStringString.set(this, "onsubmit", newValue)}

    var onSuspend : String
        get()  = attributeStringString.get(this, "onsuspend")
        set(newValue) {attributeStringString.set(this, "onsuspend", newValue)}

    var onTimeUpdate : String
        get()  = attributeStringString.get(this, "ontimeupdate")
        set(newValue) {attributeStringString.set(this, "ontimeupdate", newValue)}

    var onVolumeChange : String
        get()  = attributeStringString.get(this, "onvolumechange")
        set(newValue) {attributeStringString.set(this, "onvolumechange", newValue)}

    var onWaiting : String
        get()  = attributeStringString.get(this, "onwaiting")
        set(newValue) {attributeStringString.set(this, "onwaiting", newValue)}

}

public interface FormServerAttributeGroupFacade : Tag {
    var defaultButton : String
        get()  = attributeStringString.get(this, "DefaultButton")
        set(newValue) {attributeStringString.set(this, "DefaultButton", newValue)}

    var defaultFocus : String
        get()  = attributeStringString.get(this, "DefaultFocus")
        set(newValue) {attributeStringString.set(this, "DefaultFocus", newValue)}

    var submitDisabledControls : Boolean
        get()  = attributeBooleanBoolean.get(this, "SubmitDisabledControls")
        set(newValue) {attributeBooleanBoolean.set(this, "SubmitDisabledControls", newValue)}

}

public interface InputServerAttributeGroupFacade : Tag {
    var causesValidation : Boolean
        get()  = attributeBooleanBoolean.get(this, "CausesValidation")
        set(newValue) {attributeBooleanBoolean.set(this, "CausesValidation", newValue)}

    var validationGroup : String
        get()  = attributeStringString.get(this, "ValidationGroup")
        set(newValue) {attributeStringString.set(this, "ValidationGroup", newValue)}

}

public interface SelectServerAttributeGroupFacade : Tag {
    var dataSourceID : String
        get()  = attributeStringString.get(this, "DataSourceID")
        set(newValue) {attributeStringString.set(this, "DataSourceID", newValue)}

    var dataTextField : String
        get()  = attributeStringString.get(this, "DataTextField")
        set(newValue) {attributeStringString.set(this, "DataTextField", newValue)}

    var dataValueField : String
        get()  = attributeStringString.get(this, "DataValueField")
        set(newValue) {attributeStringString.set(this, "DataValueField", newValue)}

}

