package solid.srp

open class Animal(val name: String) {
    open fun makeSound() {
        println("$name esta haciendo sonido.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound(){
        println("$name esta ladrando.")
    }
}

class Cat(name: String): Animal(name){
    override fun makeSound(){
        println("$name esta maullando.")
    }
}

class Bird(name: String):Animal(name){
    override fun makeSound(){
        println("$name esta kikiriquiando.")
    }
}

fun main(){
    val perro=Dog("Bunker")
    perro.makeSound()

    val gato=Cat("Pelusa")
    gato.makeSound()

    val pajaroLoco=Bird("Carmen")
    pajaroLoco.makeSound()
}

