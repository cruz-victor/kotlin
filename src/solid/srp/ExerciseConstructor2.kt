package solid.srp

class Person2{
    var name:String
    var age:Int

    constructor(name:String, age:Int){
        this.name=name
        this.age=age
    }

    constructor(name:String){
        this.name=name
        this.age=10
    }

    constructor(){
        this.name="sin nombre"
        this.age=0
    }
}

fun main(){
    val victor=Person2("Victor Manuel",30)
    val grace=Person2("Reina Grace")
    val elon=Person2()

    println("Me llamo ${victor.name} y tengo ${victor.age} años")
    println("Me llamo ${grace.name} y tengo ${grace.age} años")
    println("Me llamo ${elon.name} y tengo ${elon.age} años")
}