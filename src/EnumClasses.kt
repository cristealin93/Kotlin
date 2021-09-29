import java.util.*

enum class EntityType{
    EASY,MEDIUM,HARD

}

object EntityEnum{
    fun create(type:EntityType):EntityEnumClass{
        val id=UUID.randomUUID().toString()
        val name=when(type){
            EntityType.EASY->type.name.lowercase().replaceFirstChar { ("e");"E" }
            EntityType.MEDIUM->type.name.lowercase().replaceFirstChar { ("M");"M" }
            EntityType.HARD->type.name.lowercase().replaceFirstChar { ("h");"H" }
        }
        return EntityEnumClass(id, name)
    }
}
class EntityEnumClass(val id: String,val name:String){

    override fun toString(): String {
        return "id:$id name:$name"
    }

}

fun main(){
    val entity=EntityEnum.create(EntityType.EASY)
    println(entity)
    val medium=EntityEnum.create(EntityType.MEDIUM)
    println(medium)
    val hard=EntityEnum.create(EntityType.HARD)
    println(hard)
}