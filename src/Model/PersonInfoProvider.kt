package Model

import Inheritance

interface PersonInfoProvider {

    val providerInfo:String

    fun printInfo(person: Person){
        println(providerInfo)
        person.unTest()
    }
}

interface SessionInfoProvider{
    fun getSessionId():String
}

open class BasicInfoProvider: PersonInfoProvider,SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix="Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print info")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

fun main(){

    val test=object :PersonInfoProvider{
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId()="SessionId"
    }
    test.printInfo(Person())
    test.getSessionId()
    checkType(test)
}

fun checkType(infoProvider:PersonInfoProvider){
    if(infoProvider is SessionInfoProvider) {
        println("is a session info provider")
    }else{
        println("no session info provider")
        infoProvider.providerInfo
    }
}