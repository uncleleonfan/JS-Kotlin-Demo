import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlin.browser.document

fun main(args: Array<String>) {
    val root = document.getElementById("root")

    document.create.div {

    }

/*    val div = document.createElement("div")
    val h1 = document.createElement("h1")
    val button = document.createElement("button")

    h1.textContent = "Hello World！"
    button.textContent = "Click Me"
    button.addEventListener("click", { println("clicked")})

    div.appendChild(h1)
    div.appendChild(button)
    root!!.appendChild(div)*/

}
