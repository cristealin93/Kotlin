import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main(){

    measureTime {
        //val name= listOf<Int>(1,2,3,4,5)
        val sList= generateSequence(0){it+1}
            .take(50_00)
            .toList()
        val rez1 =sList.average()

        print(sList)
        print(rez1)
//
//        val rez=name.filter(::Rtrue)
//        print(rez)
    }


}
//fun Rtrue(name:Int):Boolean{
//
//    return name>5
//}

fun measureTime(block:()->Unit){
    val timeNano= measureNanoTime(block)
    val miliTime=TimeUnit.NANOSECONDS.toMillis(timeNano)
    println("\n$miliTime :ms")
}