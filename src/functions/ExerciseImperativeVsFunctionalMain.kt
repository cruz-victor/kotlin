package functions

fun main() {
//    imperativeDuplicateArrayNumbers()
//    functionalDuplicateArrayNumbers()
//    imperativeFilterEvenNumbers()
//    functionalFilterEvenNumbers()
//    imperativeGetSquearesOfOddNumbers()
//    functionalGetSquearesOfOddNumbers()
    imperativeCalculateStatistics()
    functionalCalculateStatistics()
}

private fun imperativeDuplicateArrayNumbers() {
//    1. Crear una lista mutable para guardar los numero duplicados
//    2. Recorrer el array de numeros con un for
//    3. Multiplicar cada elemento del array y agregar a la nueva lista
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val doubleNumbers = mutableListOf<Int>()
    for (number in numbers) {
        doubleNumbers.add(number * 2)
    }
    println(doubleNumbers)
}

private fun functionalDuplicateArrayNumbers() {
    //1. Duplicar cada elemento del array
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val doubleNumbers = numbers.map { it * 2 }
    println(doubleNumbers)
}

private fun imperativeFilterEvenNumbers() {
    //    1. Crear una lista mutable para guardar los numero pares
    //    2. Recorrer el array de numeros con un for
    //    3. Comprobar si el elemento es par, en caso positivo, agregar a la nueva lista
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    println(evenNumbers)
}

private fun functionalFilterEvenNumbers() {
//    1. Filtrar los numero pares
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
//  val evenNumbers = numbers.filter { it % 2 == 0 }
    val evenNumbers = numbers.filter { number -> number % 2 == 0 }
    println(evenNumbers)
}

//Even=pares; Odd=impares;
private fun imperativeGetSquearesOfOddNumbers() {
//    1. Crear una lista vacía.
//    2. Iterar los números.
//    3. Filtrar los impares.
//    4. Calcular el cuadrado.
//    5. Agregarlo a la lista.
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val resultNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 != 0) {
            resultNumbers.add(number * number)
        }
    }
    println(resultNumbers)
}

private fun functionalGetSquearesOfOddNumbers() {
    //1. Filtrar los numeros impares
    //2. Transformar cada numero al cuadrado
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
//    val resultNumbers=numbers.filter { it%2!=0 }.map { it*it }
    val resultNumbers=numbers.filter { number->number%2!=0 }.map { number->number*number }
    println(resultNumbers)
}

private fun imperativeCalculateStatistics() {
    //  1. Crear una variable para almacenar la suma total de elementos
    //  2. Iterar el array de numeros
    //  3. En la variable sum acumular la suma
    //  4. Obtener la cantidad de elementos del array
    //  5. Calcular el promedio diviendo sum/total de elementos

    val numbers = listOf<Int>(10, 20, 30, 40, 50)

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    val average = sum / numbers.size

    println("Sum: $sum, Average: $average")
}

private fun functionalCalculateStatistics() {
//    1. Obtener la suma de los elementos del array
//    2. Obtener el promedio de los elementos del array
    val numbers= listOf<Int>(10,20,30,40,50)
    val sum = numbers.sum()
    val average = numbers.average()
    println("Sum: $sum, Average: $average")
}