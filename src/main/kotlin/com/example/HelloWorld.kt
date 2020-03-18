package com.example

import io.kweb.Kweb
import io.kweb.dom.element.creation.tags.button
import io.kweb.dom.element.creation.tags.h1
import io.kweb.dom.element.creation.tags.input
import io.kweb.dom.element.creation.tags.span
import io.kweb.dom.element.new
import io.kweb.state.KVar
import io.kweb.state.path
import io.kweb.state.simpleUrlParser

fun main() {
    Kweb(port = 8080) {
        doc.body.new {
            val path = url(simpleUrlParser).path
            val greeting = path.map { it.removePrefix("/") }.map { "Hello " + if (it.isNotBlank()) it else "World" }

            val next = KVar("")

            h1().text(greeting)
            span().text("Where to next?")
            input().setValue(next)
            button().text("Go!").on.click {
                path.value = next.value
            }
        }

    }
}


