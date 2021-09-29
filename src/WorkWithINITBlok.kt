
internal class Axel(val numberOfAxel:Int){

}

open class Vehicle(var color:String) {

    private lateinit var number: MutableList<Axel>

    fun printColor() {
        println("The vehicle color id: $color")
    }

    fun addAxel(numberOfAxel: Int) {
        number = mutableListOf<Axel>()
        number.add(Axel(numberOfAxel))

        val t= mutableListOf<String>("Alin")
        t.forEach{it->println(it)}

        for (i in number) {
            print(i)
        }
    }
}

fun main(){

    val v=Vehicle("red")
    v.printColor()
    v.addAxel(3)

}