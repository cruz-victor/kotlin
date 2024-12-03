package controlstructures

fun main() {
//    Generar numero del 1 al 10
    for (number in 1..10){
        println("El numero generado es: $number")
    }

//    Generar letras de la 'a' a la 'n'
    for (character in 'a'..'e'){
        println("El caracter generado es: $character")
    }

//    Generar numeros del 10 al 1
    for (number in 10 downTo 1){
        println("El numero generado decreciente es: $number")
    }

//    Generar letras de la 'n' a la 'a'
    for (character in 'e' downTo 'a'){
        println("El numero generado decreciente es: $character")
    }

//    Iterar el array greeting con for
    var grettings = arrayOf("Hola", "Hi", "Bienvenido", "Buenos dias", "Hallo")
    for (greeting in grettings){
        println("El tipo de saludo es: $greeting")
    }
}