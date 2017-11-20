import kotlinx.html.button
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.EventListener
import kotlin.browser.document

fun main(args: Array<String>) {
    val root = document.getElementById("root")

    val div = div {
        h1 {
            +"Hello World"
        }
        button {
            +"Click Me"
            onClickFunction = { println("clicked") }
        }
    }

    root!!.appendChild(div)

/*
    val div = document.create.div {
        h1 {
            +"Hello World"
        }
        button {
            +"Click Me"
            onClickFunction = { println("clicked") }
        }
    }

    root!!.appendChild(div)
*/

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
