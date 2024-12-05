package functions

fun main(){
    val welcome="Hola"
    val user= "Vix"

    println(showWelcomeMessage(welcome))
    println(showWelcomeMessage(welcome, user))
}

fun showWelcomeMessage(welcome: String, user:String = "Elon"): String = welcome.plus(" ").plus(user).trim()
