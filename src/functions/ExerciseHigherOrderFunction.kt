package functions

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    println("---Solucion tradicional---")
    println(operationDouble(numbers))
    println(operationTriple(numbers))
    println(operationSquare(numbers))

    println("---Solucion con funcion de orden superior---")
    println(processNumber(numbers,{number->number*2}))
    println(processNumber(numbers,{number->number*3}))
    println(processNumber(numbers,{number->number*number}))
}

private fun operationDouble(numbers: List<Int>): List<Int> {
    return numbers.map { it * 2 }
}

private fun operationTriple(numbers: List<Int>): List<Int> {
    return numbers.map { it * 3 }
}

private fun operationSquare(numbers: List<Int>): List<Int> {
    return numbers.map { it * it }
}

private fun processNumber(numbers: List<Int>, operation: (Int)->Int ):List<Int>{
    return numbers.map(operation)
}