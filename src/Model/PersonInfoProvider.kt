package Model

interface PersonInfoProvider {
    fun printInfo(person: Person)
}

class BasicInfoProvider: PersonInfoProvider {
    override fun printInfo(person: Person) {
        print("PrintInfo")
    }
}

fun main(){

    val test=BasicInfoProvider()
    test.printInfo(Person())
}