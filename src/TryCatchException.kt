import java.lang.Exception

fun main() {

    val number = Types(5)
    try {

        testException(number)
        println("Done")

    } catch (ex: Exception) {
        println("Catch it")
    }
}

fun testException(number: Types) {
    if (number.age >= 5) {
        throw Exception("Bau")
    } else {
        println("It's eligible!")
    }
}

data class Types(val age: Int)