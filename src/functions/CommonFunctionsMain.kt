package functions

import java.lang.StringBuilder

fun main() {
    val greeting = "Welcome to La Paz city"

    val newGreeting = addStarsFormat(greeting, 5)
    println(newGreeting)

    val greeting2 = "Hi"
    println(addStarsFormat(greeting2, 3))
}

fun addStarsFormat(text: String, startNumber: Int): String {
    val newText = StringBuilder(text)
    newText.insert(0, " ")
    newText.insert(newText.length, " ")

    for (i in 0 until startNumber) {
        newText.insert(0, "*")
        newText.insert(newText.length, "*")
    }

    return newText.toString()
}