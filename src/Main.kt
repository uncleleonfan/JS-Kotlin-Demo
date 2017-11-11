import kotlin.browser.document

fun main(args: Array<String>) {
    val root = document.getElementById("root")
    val html = """
    <h1>Hello</h1>
    <button id="b1">Click Me</button>
    """
    root!!.innerHTML = html
    val b1 = document.getElementById("b1");
    b1!!.addEventListener("click", { println("clicked")})
}
