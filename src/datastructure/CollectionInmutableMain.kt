package datastructure

fun main() {
    //listExample()
    //setExample()
    mapExample()
}

private fun listExample() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    println(numbers[2])
    numbers.forEach { println(it) }
}

private fun setExample() {
    val numbers = setOf<Int>(1, 2, 2, 2, 3, 4, 5)
    println(numbers.size)
    numbers.forEach { println(it) }
}

private fun mapExample(){
    val products = mapOf<Int,String>(
        1 to "Coca cola",
        2 to "Fanta",
        3 to "Sprinte",
        4 to "Simba",
        5 to "Inka Cola"
    )
    products.forEach { k, v -> println("$k. $v") }
}
