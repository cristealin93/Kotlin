

fun main(){

    var input= readLine()
    println(input)

//    val lambda:(String)->Unit= { name: String -> println("$name Soare") }
//    lambda("Test")

    val newLambda:(Int)->Int={text:Int->text+5}

    lanFun { player :String-> "$player is a great assets" }

    nextText { next:String-> "$next it is beter" }

}


fun lanFun(block:(String)->String){

    val list=listOf(
        "Alin",
        "Vasile",
        "Jhon",
        "Petre",
        "Andrei"
        )

    val randomPlayer=list.random()
    println("The next player is $randomPlayer")
    val testBlock=block(randomPlayer)
    println(testBlock)
}

fun nextText(block:(String)->String){

    val t1="acasa"
    val t2=block(t1)
    println(t2)
}