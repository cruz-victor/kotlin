package solid.srp

class Person3 {
    private var _name: String = "Sin nombre"
    private var _age: Int = 0
    private var _gender: String = "X"

    var name: String
        get() = this._name
        set(value) {
            if (value.isNotBlank()) {
                this._name = value
            } else {
                println("El nombre no puede estar vacio. Se usar el valor predeterminado.")
            }
        }

    var age: Int
        get() = this._age
        set(value) {
            if (value >= 0) {
                this._age = value
            } else {
                println("La edad no puede ser negativa. Se usara el valor predeterminado")
            }
        }

    var gender: String
        get() = this._gender
        set(value) {
            if (value.equals("M") or value.equals("F")) {
                this._gender = value
            } else {
                println("El genero tiene que ser Masculino(M) o Femenino(F).")
            }
        }
}

fun main() {
    val user = Person3()
    user.name = "Victor"
    println("Nombre ${user.name}")

    user.name = ""
    println("Nombre actualizado ${user.name}")

    user.age = 10
    println("Edad ${user.age}")

    user.age = -10
    println("Edad actualizado ${user.age}")

    user.gender = "M"
    println("Genero ${user.gender}")

    user.gender = "A"
    println("Genero actualizado ${user.gender}")
}