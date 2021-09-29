import Model.BasicInfoProvider
import Model.Person

class Inheritance : BasicInfoProvider(){

    override val sessionIdPrefix: String
        get() = "Facny session"

    override val providerInfo: String
        get() = "Fancy"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Funcy info" )
    }

}