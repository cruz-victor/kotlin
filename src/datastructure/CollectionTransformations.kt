package datastructure

fun main() {
//    mapToLanguage()
//    mapToNumbersList()
    mapToMixList()
}

private fun mapToLanguage() {
    val languages = listOf<String>("Java", "Python", "C++", "C#", "Javascript")
    println(languages)
    languages
        .map { "Lenguaje $it" }
        .forEach { println(it) }
}

private fun mapToNumbersList() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    numbers
        .map { "$it. Item" }
        .forEach { println(it) }
}

private fun mapToMixList() {
    val objects = listOf<Any>(1, 2, 3, 4, "5", "10", "Hola", "Vic")
    val numbers = objects.filterIsInstance<Int>()
    println(numbers)
    val allNumbers = objects.mapNotNull {
        it.toString().toIntOrNull()
    }
    println(allNumbers)
}