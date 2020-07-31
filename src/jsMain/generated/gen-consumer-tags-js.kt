package kotlinx.html.js

import kotlinx.html.*
import kotlinx.html.attributes.enumEncode
import org.w3c.dom.*

/*******************************************************************************
DO NOT EDIT
This file was generated by module generate
 *******************************************************************************/

/**
 * Anchor
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.a(
  href: String? = null,
  target: String? = null,
  classes: String? = null,
  crossinline block: A<Event>.() -> Unit = {}
): HTMLAnchorElement = A(attributesMapOf("href", href, "target", target, "class", classes), this).visitAndFinalize(
  this,
  block
) as HTMLAnchorElement

/**
 * Abbreviated form (e.g., WWW, HTTP,etc.)
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.abbr(
  classes: String? = null,
  crossinline block: ABBR<Event>.() -> Unit = {}
): HTMLElement = ABBR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Information on author
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.address(
  classes: String? = null,
  crossinline block: ADDRESS<Event>.() -> Unit = {}
): HTMLElement = ADDRESS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Client-side image map area
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.area(
  shape: AreaShape? = null,
  alt: String? = null,
  classes: String? = null,
  crossinline block: AREA<Event>.() -> Unit = {}
): HTMLAreaElement =
  AREA(attributesMapOf("Shape", shape?.enumEncode(), "alt", alt, "class", classes), this).visitAndFinalize(
    this,
    block
  ) as HTMLAreaElement

/**
 * Self-contained syndicatable or reusable composition
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.article(
  classes: String? = null,
  crossinline block: ARTICLE<Event>.() -> Unit = {}
): HTMLElement = ARTICLE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Sidebar for tangentially related content
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.aside(
  classes: String? = null,
  crossinline block: ASIDE<Event>.() -> Unit = {}
): HTMLElement = ASIDE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Audio player
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.audio(
  classes: String? = null,
  crossinline block: AUDIO<Event>.() -> Unit = {}
): HTMLAudioElement = AUDIO(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLAudioElement

/**
 * Bold text style
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.b(
  classes: String? = null,
  crossinline block: B<Event>.() -> Unit = {}
): HTMLElement = B(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document base URI
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.base(
  classes: String? = null,
  crossinline block: BASE<Event>.() -> Unit = {}
): HTMLBaseElement = BASE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLBaseElement

/**
 * Text directionality isolation
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.bdi(
  classes: String? = null,
  crossinline block: BDI<Event>.() -> Unit = {}
): HTMLElement = BDI(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * I18N BiDi over-ride
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.bdo(
  classes: String? = null,
  crossinline block: BDO<Event>.() -> Unit = {}
): HTMLElement = BDO(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Long quotation
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.blockQuote(
  classes: String? = null,
  crossinline block: BLOCKQUOTE<Event>.() -> Unit = {}
): HTMLElement = BLOCKQUOTE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document body
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.body(
  classes: String? = null,
  crossinline block: BODY<Event>.() -> Unit = {}
): HTMLBodyElement = BODY(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLBodyElement

/**
 * Forced line break
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.br(
  classes: String? = null,
  crossinline block: BR<Event>.() -> Unit = {}
): HTMLBRElement = BR(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLBRElement

/**
 * Push button
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.button(
  formEncType: ButtonFormEncType? = null,
  formMethod: ButtonFormMethod? = null,
  name: String? = null,
  type: ButtonType? = null,
  classes: String? = null,
  crossinline block: BUTTON<Event>.() -> Unit = {}
): HTMLButtonElement = BUTTON(
  attributesMapOf(
    "formenctype",
    formEncType?.enumEncode(),
    "formmethod",
    formMethod?.enumEncode(),
    "name",
    name,
    "type",
    type?.enumEncode(),
    "class",
    classes
  ), this
).visitAndFinalize(this, block) as HTMLButtonElement

/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.canvas(classes: String? = null, content: String = ""): HTMLCanvasElement =
  CANVAS(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content }) as HTMLCanvasElement

/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.canvas(
  classes: String? = null,
  crossinline block: CANVAS<Event>.() -> Unit = {}
): HTMLCanvasElement =
  CANVAS(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLCanvasElement

/**
 * Table caption
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.caption(
  classes: String? = null,
  crossinline block: CAPTION<Event>.() -> Unit = {}
): HTMLElement = CAPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Citation
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.cite(
  classes: String? = null,
  crossinline block: CITE<Event>.() -> Unit = {}
): HTMLElement = CITE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Computer code fragment
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.code(
  classes: String? = null,
  crossinline block: CODE<Event>.() -> Unit = {}
): HTMLElement = CODE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table column
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.col(
  classes: String? = null,
  crossinline block: COL<Event>.() -> Unit = {}
): HTMLTableColElement =
  COL(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableColElement

/**
 * Table column group
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.colGroup(
  classes: String? = null,
  crossinline block: COLGROUP<Event>.() -> Unit = {}
): HTMLTableColElement =
  COLGROUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableColElement

@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.command(
  type: CommandType? = null,
  classes: String? = null,
  crossinline block: COMMAND<Event>.() -> Unit = {}
): HTMLElement =
  COMMAND(attributesMapOf("type", type?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Container for options for
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.dataList(
  classes: String? = null,
  crossinline block: DATALIST<Event>.() -> Unit = {}
): HTMLDataListElement =
  DATALIST(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDataListElement

/**
 * Definition description
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.dd(
  classes: String? = null,
  crossinline block: DD<Event>.() -> Unit = {}
): HTMLElement = DD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Deleted text
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.del(
  classes: String? = null,
  crossinline block: DEL<Event>.() -> Unit = {}
): HTMLElement = DEL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Disclosure control for hiding details
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.details(
  classes: String? = null,
  crossinline block: DETAILS<Event>.() -> Unit = {}
): HTMLDetailsElement =
  DETAILS(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDetailsElement

/**
 * Instance definition
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.dfn(
  classes: String? = null,
  crossinline block: DFN<Event>.() -> Unit = {}
): HTMLElement = DFN(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Dialog box or window
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.dialog(
  classes: String? = null,
  crossinline block: DIALOG<Event>.() -> Unit = {}
): HTMLDialogElement =
  DIALOG(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDialogElement

/**
 * Generic language/style container
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.div(
  classes: String? = null,
  crossinline block: DIV<Event>.() -> Unit = {}
): HTMLDivElement = DIV(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDivElement

/**
 * Definition list
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.dl(
  classes: String? = null,
  crossinline block: DL<Event>.() -> Unit = {}
): HTMLElement = DL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Definition term
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.dt(
  classes: String? = null,
  crossinline block: DT<Event>.() -> Unit = {}
): HTMLElement = DT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Emphasis
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.em(
  classes: String? = null,
  crossinline block: EM<Event>.() -> Unit = {}
): HTMLElement = EM(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Plugin
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.embed(
  classes: String? = null,
  crossinline block: EMBED<Event>.() -> Unit = {}
): HTMLEmbedElement = EMBED(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLEmbedElement

/**
 * Form control group
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.fieldSet(
  classes: String? = null,
  crossinline block: FIELDSET<Event>.() -> Unit = {}
): HTMLFieldSetElement =
  FIELDSET(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLFieldSetElement

/**
 * Caption for
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.figcaption(
  classes: String? = null,
  crossinline block: FIGCAPTION<Event>.() -> Unit = {}
): HTMLElement = FIGCAPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Figure with optional caption
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.figure(
  classes: String? = null,
  crossinline block: FIGURE<Event>.() -> Unit = {}
): HTMLElement = FIGURE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Footer for a page or section
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.footer(
  classes: String? = null,
  crossinline block: FOOTER<Event>.() -> Unit = {}
): HTMLElement = FOOTER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Interactive form
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.form(
  action: String? = null,
  encType: FormEncType? = null,
  method: FormMethod? = null,
  classes: String? = null,
  crossinline block: FORM<Event>.() -> Unit = {}
): HTMLFormElement = FORM(
  attributesMapOf(
    "action",
    action,
    "enctype",
    encType?.enumEncode(),
    "method",
    method?.enumEncode(),
    "class",
    classes
  ), this
).visitAndFinalize(this, block) as HTMLFormElement

/**
 * Heading
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.h1(
  classes: String? = null,
  crossinline block: H1<Event>.() -> Unit = {}
): HTMLHeadingElement = H1(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.h2(
  classes: String? = null,
  crossinline block: H2<Event>.() -> Unit = {}
): HTMLHeadingElement = H2(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.h3(
  classes: String? = null,
  crossinline block: H3<Event>.() -> Unit = {}
): HTMLHeadingElement = H3(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.h4(
  classes: String? = null,
  crossinline block: H4<Event>.() -> Unit = {}
): HTMLHeadingElement = H4(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.h5(
  classes: String? = null,
  crossinline block: H5<Event>.() -> Unit = {}
): HTMLHeadingElement = H5(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.h6(
  classes: String? = null,
  crossinline block: H6<Event>.() -> Unit = {}
): HTMLHeadingElement = H6(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document head
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.head(content: String = ""): HTMLHeadElement =
  HEAD(emptyMap, this).visitAndFinalize(this, { +content }) as HTMLHeadElement

/**
 * Document head
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.head(crossinline block: HEAD<Event>.() -> Unit = {}): HTMLHeadElement =
  HEAD(emptyMap, this).visitAndFinalize(this, block) as HTMLHeadElement

/**
 * Introductory or navigational aids for a page or section
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.header(
  classes: String? = null,
  crossinline block: HEADER<Event>.() -> Unit = {}
): HTMLElement = HEADER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.hGroup(
  classes: String? = null,
  crossinline block: HGROUP<Event>.() -> Unit = {}
): HTMLElement = HGROUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Horizontal rule
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.hr(
  classes: String? = null,
  crossinline block: HR<Event>.() -> Unit = {}
): HTMLHRElement = HR(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHRElement

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document root element
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.html(content: String = "", namespace: String? = null): HTMLHtmlElement =
  HTML(emptyMap, this, namespace).visitAndFinalize(this, { +content }) as HTMLHtmlElement

/**
 * Document root element
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.html(
  namespace: String? = null,
  crossinline block: HTML<Event>.() -> Unit = {}
): HTMLHtmlElement = HTML(emptyMap, this, namespace).visitAndFinalize(this, block) as HTMLHtmlElement

/**
 * Italic text style
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.i(
  classes: String? = null,
  crossinline block: I<Event>.() -> Unit = {}
): HTMLElement = I(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Inline subwindow
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.iframe(
  sandbox: IframeSandbox? = null,
  classes: String? = null,
  content: String = ""
): HTMLElement =
  IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), this).visitAndFinalize(this, { +content })

/**
 * Inline subwindow
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.iframe(
  sandbox: IframeSandbox? = null,
  classes: String? = null,
  crossinline block: IFRAME<Event>.() -> Unit = {}
): HTMLElement =
  IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Embedded image
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.img(
  alt: String? = null,
  src: String? = null,
  classes: String? = null,
  crossinline block: IMG<Event>.() -> Unit = {}
): HTMLImageElement =
  IMG(attributesMapOf("alt", alt, "src", src, "class", classes), this).visitAndFinalize(this, block) as HTMLImageElement

/**
 * Form control
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.input(
  type: InputType? = null,
  formEncType: InputFormEncType? = null,
  formMethod: InputFormMethod? = null,
  name: String? = null,
  classes: String? = null,
  crossinline block: INPUT<Event>.() -> Unit = {}
): HTMLInputElement = INPUT(
  attributesMapOf(
    "type",
    type?.enumEncode(),
    "formenctype",
    formEncType?.enumEncode(),
    "formmethod",
    formMethod?.enumEncode(),
    "name",
    name,
    "class",
    classes
  ), this
).visitAndFinalize(this, block) as HTMLInputElement

/**
 * Inserted text
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.ins(
  classes: String? = null,
  crossinline block: INS<Event>.() -> Unit = {}
): HTMLElement = INS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Text to be entered by the user
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.kbd(
  classes: String? = null,
  crossinline block: KBD<Event>.() -> Unit = {}
): HTMLElement = KBD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Cryptographic key-pair generator form control
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.keyGen(
  keyType: KeyGenKeyType? = null,
  classes: String? = null,
  crossinline block: KEYGEN<Event>.() -> Unit = {}
): HTMLElement =
  KEYGEN(attributesMapOf("keytype", keyType?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Form field label text
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.label(
  classes: String? = null,
  crossinline block: LABEL<Event>.() -> Unit = {}
): HTMLLabelElement = LABEL(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLLabelElement

/**
 * Fieldset legend
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.legend(
  classes: String? = null,
  crossinline block: LEGEND<Event>.() -> Unit = {}
): HTMLLegendElement =
  LEGEND(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLLegendElement

/**
 * List item
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.li(
  classes: String? = null,
  crossinline block: LI<Event>.() -> Unit = {}
): HTMLLIElement = LI(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLLIElement

/**
 * A media-independent link
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.link(
  href: String? = null,
  rel: String? = null,
  type: String? = null,
  crossinline block: LINK<Event>.() -> Unit = {}
): HTMLLinkElement =
  LINK(attributesMapOf("href", href, "rel", rel, "type", type), this).visitAndFinalize(this, block) as HTMLLinkElement

/**
 * Container for the dominant contents of another element
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.main(
  classes: String? = null,
  crossinline block: MAIN<Event>.() -> Unit = {}
): HTMLElement = MAIN(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Client-side image map
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.map(
  name: String? = null,
  classes: String? = null,
  crossinline block: MAP<Event>.() -> Unit = {}
): HTMLMapElement =
  MAP(attributesMapOf("name", name, "class", classes), this).visitAndFinalize(this, block) as HTMLMapElement

/**
 * Highlight
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.mark(
  classes: String? = null,
  crossinline block: MARK<Event>.() -> Unit = {}
): HTMLElement = MARK(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.math(
  classes: String? = null,
  crossinline block: MATH<Event>.() -> Unit = {}
): HTMLElement = MATH(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.mathml(classes: String? = null, content: String = ""): HTMLElement =
  MATHML(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content })

@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.mathml(
  classes: String? = null,
  crossinline block: MATHML<Event>.() -> Unit = {}
): HTMLElement = MATHML(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.meta(
  name: String? = null,
  content: String? = null,
  charset: String? = null,
  crossinline block: META<Event>.() -> Unit = {}
): HTMLMetaElement = META(attributesMapOf("name", name, "content", content, "charset", charset), this).visitAndFinalize(
  this,
  block
) as HTMLMetaElement

/**
 * Gauge
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.meter(
  classes: String? = null,
  crossinline block: METER<Event>.() -> Unit = {}
): HTMLMeterElement = METER(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLMeterElement

/**
 * Section with navigational links
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.nav(
  classes: String? = null,
  crossinline block: NAV<Event>.() -> Unit = {}
): HTMLElement = NAV(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.noScript(
  classes: String? = null,
  crossinline block: NOSCRIPT<Event>.() -> Unit = {}
): HTMLElement = NOSCRIPT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic embedded object
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.htmlObject(
  classes: String? = null,
  crossinline block: OBJECT<Event>.() -> Unit = {}
): HTMLElement = OBJECT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ordered list
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.ol(
  classes: String? = null,
  crossinline block: OL<Event>.() -> Unit = {}
): HTMLElement = OL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Option group
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.optGroup(
  label: String? = null,
  classes: String? = null,
  crossinline block: OPTGROUP<Event>.() -> Unit = {}
): HTMLOptGroupElement =
  OPTGROUP(attributesMapOf("label", label, "class", classes), this).visitAndFinalize(this, block) as HTMLOptGroupElement

/**
 * Selectable choice
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.option(classes: String? = null, content: String = ""): HTMLOptionElement =
  OPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content }) as HTMLOptionElement

/**
 * Selectable choice
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.option(
  classes: String? = null,
  crossinline block: OPTION<Event>.() -> Unit = {}
): HTMLOptionElement =
  OPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLOptionElement

/**
 * Calculated output value
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.output(
  classes: String? = null,
  crossinline block: OUTPUT<Event>.() -> Unit = {}
): HTMLOutputElement =
  OUTPUT(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLOutputElement

/**
 * Paragraph
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.p(
  classes: String? = null,
  crossinline block: P<Event>.() -> Unit = {}
): HTMLParagraphElement =
  P(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLParagraphElement

/**
 * Named property value
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.param(
  name: String? = null,
  value: String? = null,
  crossinline block: PARAM<Event>.() -> Unit = {}
): HTMLParamElement =
  PARAM(attributesMapOf("name", name, "value", value), this).visitAndFinalize(this, block) as HTMLParamElement

/**
 * Preformatted text
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.pre(
  classes: String? = null,
  crossinline block: PRE<Event>.() -> Unit = {}
): HTMLPreElement = PRE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLPreElement

/**
 * Progress bar
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.progress(
  classes: String? = null,
  crossinline block: PROGRESS<Event>.() -> Unit = {}
): HTMLProgressElement =
  PROGRESS(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLProgressElement

/**
 * Short inline quotation
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.q(
  classes: String? = null,
  crossinline block: Q<Event>.() -> Unit = {}
): HTMLElement = Q(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Parenthesis for ruby annotation text
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.rp(
  classes: String? = null,
  crossinline block: RP<Event>.() -> Unit = {}
): HTMLElement = RP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ruby annotation text
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.rt(
  classes: String? = null,
  crossinline block: RT<Event>.() -> Unit = {}
): HTMLElement = RT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ruby annotation(s)
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.ruby(
  classes: String? = null,
  crossinline block: RUBY<Event>.() -> Unit = {}
): HTMLElement = RUBY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Strike-through text style
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.samp(
  classes: String? = null,
  crossinline block: SAMP<Event>.() -> Unit = {}
): HTMLElement = SAMP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Script statements
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.script(
  type: String? = null,
  src: String? = null,
  content: String = ""
): HTMLScriptElement =
  SCRIPT(attributesMapOf("type", type, "src", src), this).visitAndFinalize(this, { +content }) as HTMLScriptElement

/**
 * Script statements
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.script(
  type: String? = null,
  src: String? = null,
  crossinline block: SCRIPT<Event>.() -> Unit = {}
): HTMLScriptElement =
  SCRIPT(attributesMapOf("type", type, "src", src), this).visitAndFinalize(this, block) as HTMLScriptElement

/**
 * Generic document or application section
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.section(
  classes: String? = null,
  crossinline block: SECTION<Event>.() -> Unit = {}
): HTMLElement = SECTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Option selector
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.select(
  classes: String? = null,
  crossinline block: SELECT<Event>.() -> Unit = {}
): HTMLSelectElement =
  SELECT(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLSelectElement

/**
 * Small text style
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.small(
  classes: String? = null,
  crossinline block: SMALL<Event>.() -> Unit = {}
): HTMLElement = SMALL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Media source for
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.source(
  classes: String? = null,
  crossinline block: SOURCE<Event>.() -> Unit = {}
): HTMLSourceElement =
  SOURCE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLSourceElement

/**
 * Generic language/style container
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.span(
  classes: String? = null,
  crossinline block: SPAN<Event>.() -> Unit = {}
): HTMLSpanElement = SPAN(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLSpanElement

/**
 * Strong emphasis
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.strong(
  classes: String? = null,
  crossinline block: STRONG<Event>.() -> Unit = {}
): HTMLElement = STRONG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Style info
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.style(type: String? = null, content: String = ""): HTMLStyleElement =
  STYLE(attributesMapOf("type", type), this).visitAndFinalize(this, { +content }) as HTMLStyleElement

/**
 * Style info
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.style(
  type: String? = null,
  crossinline block: STYLE<Event>.() -> Unit = {}
): HTMLStyleElement = STYLE(attributesMapOf("type", type), this).visitAndFinalize(this, block) as HTMLStyleElement

/**
 * Subscript
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.sub(
  classes: String? = null,
  crossinline block: SUB<Event>.() -> Unit = {}
): HTMLElement = SUB(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Caption for
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.summary(
  classes: String? = null,
  crossinline block: SUMMARY<Event>.() -> Unit = {}
): HTMLElement = SUMMARY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Superscript
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.sup(
  classes: String? = null,
  crossinline block: SUP<Event>.() -> Unit = {}
): HTMLElement = SUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.svg(classes: String? = null, content: String = ""): HTMLElement =
  SVG(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content })

@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.svg(
  classes: String? = null,
  crossinline block: SVG<Event>.() -> Unit = {}
): HTMLElement = SVG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 *
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.table(
  classes: String? = null,
  crossinline block: TABLE<Event>.() -> Unit = {}
): HTMLTableElement = TABLE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableElement

/**
 * Table body
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.tbody(
  classes: String? = null,
  crossinline block: TBODY<Event>.() -> Unit = {}
): HTMLTableSectionElement =
  TBODY(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableSectionElement

/**
 * Table data cell
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.td(
  classes: String? = null,
  crossinline block: TD<Event>.() -> Unit = {}
): HTMLTableCellElement =
  TD(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableCellElement

/**
 * Multi-line text field
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.textArea(
  rows: String? = null,
  cols: String? = null,
  wrap: TextAreaWrap? = null,
  classes: String? = null,
  content: String = ""
): HTMLTextAreaElement = TEXTAREA(
  attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes),
  this
).visitAndFinalize(this, { +content }) as HTMLTextAreaElement

/**
 * Multi-line text field
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.textArea(
  rows: String? = null,
  cols: String? = null,
  wrap: TextAreaWrap? = null,
  classes: String? = null,
  crossinline block: TEXTAREA<Event>.() -> Unit = {}
): HTMLTextAreaElement = TEXTAREA(
  attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes),
  this
).visitAndFinalize(this, block) as HTMLTextAreaElement

/**
 * Table footer
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.tfoot(
  classes: String? = null,
  crossinline block: TFOOT<Event>.() -> Unit = {}
): HTMLTableSectionElement =
  TFOOT(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableSectionElement

/**
 * Table header cell
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.th(
  scope: ThScope? = null,
  classes: String? = null,
  crossinline block: TH<Event>.() -> Unit = {}
): HTMLTableCellElement = TH(attributesMapOf("scope", scope?.enumEncode(), "class", classes), this).visitAndFinalize(
  this,
  block
) as HTMLTableCellElement

/**
 * Table header
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.thead(
  classes: String? = null,
  crossinline block: THEAD<Event>.() -> Unit = {}
): HTMLTableSectionElement =
  THEAD(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableSectionElement

/**
 * Machine-readable equivalent of date- or time-related data
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.time(
  classes: String? = null,
  crossinline block: TIME<Event>.() -> Unit = {}
): HTMLTimeElement = TIME(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTimeElement

/**
 * Document title
 */
@HtmlTagMarker
fun TagConsumer<HTMLElement, Event>.title(content: String = ""): HTMLTitleElement =
  TITLE(emptyMap, this).visitAndFinalize(this, { +content }) as HTMLTitleElement

/**
 * Document title
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.title(crossinline block: TITLE<Event>.() -> Unit = {}): HTMLTitleElement =
  TITLE(emptyMap, this).visitAndFinalize(this, block) as HTMLTitleElement

/**
 * Table row
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.tr(
  classes: String? = null,
  crossinline block: TR<Event>.() -> Unit = {}
): HTMLTableRowElement =
  TR(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableRowElement

/**
 * Unordered list
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.ul(
  classes: String? = null,
  crossinline block: UL<Event>.() -> Unit = {}
): HTMLElement = UL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Unordered list
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.htmlVar(
  classes: String? = null,
  crossinline block: VAR<Event>.() -> Unit = {}
): HTMLElement = VAR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Video player
 */
@HtmlTagMarker
inline fun TagConsumer<HTMLElement, Event>.video(
  classes: String? = null,
  crossinline block: VIDEO<Event>.() -> Unit = {}
): HTMLVideoElement = VIDEO(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLVideoElement

