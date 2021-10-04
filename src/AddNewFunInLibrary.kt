
fun String.initial():String{

    val initial=this.split(" ")
    val rez1=initial[0].substring(0,1)
    val rez2=initial[1].substring(0,1)

    return rez1 + rez2

}

fun Int.initialInt():Int{

    return this+5
}

fun main(){

    val test="Alin Criste"
    val number=5

    println(number.initialInt())

    println(test.initial())

}