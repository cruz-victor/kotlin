package controlstructures

fun main() {
    val isLoggedIn = true
    val hasAddress = true

    if (isLoggedIn) {
        println("Usuario logeado.")
        if (hasAddress) {
            println("Tiene correo.")
        } else {
            println("No tiene correo.")
        }
    } else {
        println("Usuario no logeado.")
    }

    val userLoggedMessage = if (isLoggedIn) "El usuario fue logeado exitosamente." else " El usuario no fue logeado."

    println(userLoggedMessage)
}
