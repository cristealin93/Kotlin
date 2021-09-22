import Model.Person

fun test(hi:String, vararg name:String) {

    name.forEach {item->
        println("$hi $item")
    }
}

fun main() {

val person=Person()
    person.unTest()
    //person.nickName
}
