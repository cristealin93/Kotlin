

fun main(){

    val test:String?=null
    val rez= test?.length
    println(rez)

    val person :Person= requireNotNull(Person("Don"))
    println(person.test)
}

class Person(val test:String)