package functions

fun main() {
//    basicOperation()
//    withoutParameters()
//    withManyParameters()
//    withStandarFunction()
//    withManyLines()
//    asAlias()
    asReturn()
}

private fun basicOperation() {
    val duplicate = { x: Int -> x * 2 }
    println(duplicate(5))

    val addThree = { x: Int -> x + 3 }
    print(addThree(5))
}

private fun withoutParameters() {
    val greeting = { "Hola vix" }
    print(greeting())
}

private fun withManyParameters() {
    val add = { x: Int, y: Int -> x + y }
    println(add(4, 5))

    val concatenate = { a: String, b: String -> "$a $b" }
    println(concatenate("Hola", "Vix"))
}

private fun withStandarFunction() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it } //map is a standar function
    println(squares)

    val names = listOf<String>("Ana", "Luis", "Eva", "Beatriz")
    val lenghtsNames = names.filter { it.length > 3 } //filter is a standar function
    println(lenghtsNames)
}

private fun withManyLines() {
    val calculateFactorial = { n: Int ->
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result //The last line is the return
    }

    println(calculateFactorial(5))
}

typealias Operation = (Int, Int) -> Int

private fun asAlias() {
    val add: Operation = { x, y -> x + y }
    val substraction: Operation = { x, y -> x - y }

    fun applyOperation(a: Int, b: Int, operation: Operation): Int {
        return operation(a, b)
    }

    println(applyOperation(10, 5, add))
    println(applyOperation(10, 5, substraction))
}

private fun asReturn() {
    fun createMultiplicator(factor: Int): (Int) -> Int {
        return { number -> number * factor }
    }

    val duplicate = createMultiplicator(2)
    val triplicate = createMultiplicator(3)

    println(duplicate(4))
    println(triplicate(4))
}