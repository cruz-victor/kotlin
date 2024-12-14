package solid.srp

interface Fly {
    fun flying()
}

class Penguin() : Fly {
    override fun flying() {
        println("La ave esta volando")
    }
}

class Airplane(): Fly{
    override fun flying() {
        println("El avion esta volando")
    }
}

fun main(){
    val flyList= listOf(Penguin(), Airplane())
    for (flyItem in flyList){
        flyItem.flying()
    }
}