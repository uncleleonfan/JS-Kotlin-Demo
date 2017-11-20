import org.w3c.dom.Node
import org.w3c.dom.events.EventListener
import kotlin.browser.document

open class Tag(name: String) {

    protected val element = document.createElement(name)

    var onClickFunction: () -> Unit = {}
        set(value) {
            element.addEventListener("click", EventListener {
                value()
            })
        }

    operator fun String.unaryPlus() {
        element.textContent = this
    }

    protected fun<T: Tag> doInit(child: T, init: T.() -> Unit): Node {
        child.init()
        element.appendChild(child.element)
        return element
    }
}

fun div(init: DIV.() -> Node) = DIV().let(init)

class DIV: Tag("div") {
    fun h1(init: H1.() -> Unit) = doInit<H1>(H1(), init)

    fun button(init: BUTTON.() -> Unit) = doInit(BUTTON(), init)
}

class H1: Tag("h1") {
}

class BUTTON: Tag("button") {
}
