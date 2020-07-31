package kotlinx.html.js

import kotlinx.html.*
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLLegendElement

@Deprecated("Use legend instead", ReplaceWith("legend(classes, block)"))
fun TagConsumer<HTMLElement, Event>.legEnd(
  classes: String? = null,
  block: LEGEND<Event>.() -> Unit = {}
): HTMLLegendElement =
  legend(classes, block)

@Deprecated("Use htmlObject instead", ReplaceWith("htmlObject(classes, block)", "kotlinx.html.js.htmlObject"))
fun TagConsumer<HTMLElement, Event>.object_(
  classes: String? = null,
  block: OBJECT<Event>.() -> Unit = {}
): HTMLElement =
  htmlObject(classes, block)

@Deprecated("Use htmlVar instead", ReplaceWith("htmlVar(classes, block)", "kotlinx.html.js.htmlVar"))
fun TagConsumer<HTMLElement, Event>.var_(classes: String? = null, block: VAR<Event>.() -> Unit = {}): HTMLElement =
  htmlVar(classes, block)
