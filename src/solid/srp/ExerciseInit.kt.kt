package solid.srp

class Person4(val name: String, val age: Int) {
    var description: String = "Sin descripcion"

    /*El bloque init se ejecuta inamediatamente del constructor primario*/
    init {
        println("INIT - Inicializando la persona: $name")
        description = if (age >= 0) {
            "Persona llamada $name con $age anos"
        } else {
            println("Edad negativa, ajustando a 0")
            "Persona llamada $name con 0 anos"
        }
    }

    init{
        println("INIT - Descripcion inicial generada: $description")
    }
}

fun main(){
    val persona=Person4("Victor",30)
    println(persona.description)

    val persona2=Person4("Elon",-10)
    println(persona2.description)
}