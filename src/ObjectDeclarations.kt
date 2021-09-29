object ObjectDeclarations{
    fun create()=EntityDeclaration("id","name")
}
class EntityDeclaration (val id: String,val name:String){

    override fun toString(): String {
        return "id:$id name:$name"
    }

}

fun main(){
    val entity=ObjectDeclarations.create()
    println(entity)
}