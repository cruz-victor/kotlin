package functions

fun main() {
    println("---7 es mayor que 5---")
//    val isValid = isValidNumber(7, { it > 5 })
    val isValid = isValidNumber(7, { number -> number > 5 })
    println(isValid)

    println("---3 es mayor que 5---")
//    val isValidv2 = isValidNumber(3, { it > 5 })
    val isValidv2 = isValidNumber(3, { number -> number > 5 })
    println(isValidv2)

    println("---150 es mayor que 100---")
    val majorThat100 = { number: Int -> number > 100 }
    val isValidv3 = isValidNumber(150, majorThat100)
    println(isValidv3)
}

//Funcion de orden superior (configurable/dinamico/generico)
private fun isValidNumber(number: Int, validate: (x: Int) -> Boolean): Boolean {
    return validate(number)
}