package Model

 open class User(val firstName: String, val lastName: String) {

    protected var fName = "Test"

   open class Chef(val age: Int, val name: String, val prenume: String) : User(name, prenume) {

        protected fun accesF() {
            println(fName)

        }

        fun setMyfName(nameFName: String) {
            fName = nameFName
            accesF()
        }

    }

}