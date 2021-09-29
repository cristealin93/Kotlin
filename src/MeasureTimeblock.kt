import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main(){
    val list= getSequenceList()

    measure {
        val rez=list.filter { it%3==0 }.average()
        println(rez)
    }
}

fun measure(block:()->Unit){
    val nano= measureNanoTime(block)
    val milliSecond=TimeUnit.NANOSECONDS.toMillis(nano)

    println("$milliSecond: Ms")
}

fun getSequenceList():List<Int>{
    val list= generateSequence(1) {it+1  }.take(9000000)
    return list.toList()
}
