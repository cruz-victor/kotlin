package functions

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)

    println("---Solucion tradicional---")
    println(operationDouble(numbers))
    println(opeartionTriple(numbers))
    println(operationSquare(numbers))

    println("---Solucion con funciones de orden superior ---")
//    println(processNumbers(numbers, { it * 2 }))
//    println(processNumbers(numbers, { it * 3 }))
//    println(processNumbers(numbers, { it * it }))
    println(processNumbers(numbers, { number -> number * 2 }))
    println(processNumbers(numbers, { number -> number * 3 }))
    println(processNumbers(numbers, { number -> number * number }))
}

//Solucion tradicional
fun operationDouble(numbers: List<Int>): List<Int> {
    return numbers.map { it * 2 }
}

fun opeartionTriple(numbers: List<Int>): List<Int> {
    return numbers.map { it * 3 }
}

fun operationSquare(numbers: List<Int>): List<Int> {
    return numbers.map { it * it }
}

//Solucion con funcion de orden superior
private fun processNumbers(numbers: List<Int>, operation: (Int) -> Int): List<Int> {
    return numbers.map(operation)
}