
fun main(){

    val list= listOf(1,2,3,4,6,8,45,85)
    println(EventGenetic(list).eventGeneric())
    val rez= listOf(
        People("Alin"),
        People("Ionut"),
        People("Vasile"),
        People("Vio")
    )
    println(rez)


}

data class People(val name:String)

class EventGenetic<T>(val event:List<T>){

    fun eventGeneric():List<T>{

        return event.filterIndexed{index,_-> index%5==0
        }
    }
}