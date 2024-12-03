package controlstructures

fun main() {
    //Options
    val option = 10
    val optionString = when (option) {
        1 -> "numero 1"
        2 -> "numero 2"
        3 -> "numero 3"
        else -> "inexistente"
    }

    println("La opcion $option y su equivalente en texto es el $optionString")

    //Data type
    val type:Any = false
    val dataType = when(type){
        is Double -> "Es Double"
        is Float -> "Es Float"
        is Int -> "Es Entero"
        is Byte -> "Es Byte"
        is Boolean -> "Es Boleano"
        else -> "No existe el tipo de dato"
    }

    println("El tipo de dato en texto es: $dataType")
}