package Model

class Person(val name:String="test",val prenume:String="test") {

    var nickName:String?=null
    set(value) {
        field=value
        println("This value is $value")
    }
//    get(){
//        println("Returned value is $field")
//        return field
//    }
    fun unTest() {
        val nickNameTwo=if(nickName !=null) nickName else "no nickname"
        println("$name  $nickNameTwo $prenume ")
    }


}