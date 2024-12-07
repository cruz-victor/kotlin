package datastructure

fun main() {
    //mutableListExample()
    //mutableSetExample()
    mutableMapExample()
}

private fun mutableListExample() {
    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(numbers)
    numbers.add(6)
    println(numbers)
    numbers.removeAt(2)
    println(numbers)
    numbers.forEach { println(it) }
}

private fun mutableSetExample() {
    val numbers = mutableSetOf<Int>(1, 2, 3, 4, 5, 5, 5, 6, 6, 6)
    println(numbers.size)
    println(numbers)
    numbers.remove(6)
    println(numbers)
    numbers.forEach { println(it) }
}

private fun mutableMapExample() {
    val products= mutableMapOf<Int, String>(
        1 to "Coca Cola",
        2 to "Fanta",
        3 to "Sprite"
    )
    println(products)
    products.put(4, "Inca Cola")
    println(products)
    products.remove(2,"Fanta")
    println(products)
}