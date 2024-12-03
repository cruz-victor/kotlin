package controlstructures

fun main() {
    //while
    val greetings = arrayOf("Hola", "Hi", "Bienvenido", "Buenos dias", "Hallo")
    var i=0
    println("---------------")
    println("Con while")
    while(i <= greetings.size-1){
        println(greetings[i])
        i++
    }

    println("---------------")
    println("Con dowhile")
    var j=0
    do {
        println(greetings[j])
        j++
    } while (j <= greetings.size-1)
}