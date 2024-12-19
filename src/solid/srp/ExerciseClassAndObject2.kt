package solid.srp

class Person(val name: String, val age: Int) {
    fun great() {
        println("Hola, mi nombre es ${this.name}, tengo ${this.age} años.")
    }
}

fun main(){
    val victor = Person("Victor Manuel",30)
    victor.great()
}