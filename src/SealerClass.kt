import java.util.*

enum class EntityTypeSeal{
   HELP, EASY,MEDIUM,HARD

}

object EntityEnumSeal{
    fun create(type:EntityTypeSeal): EntityEnumClassSeal {
        val id=UUID.randomUUID().toString()
        val name=when(type){
            EntityTypeSeal.EASY->type.name.lowercase().replaceFirstChar { ("e");"E" }
            EntityTypeSeal.MEDIUM->type.name.lowercase().replaceFirstChar { ("M");"M" }
            EntityTypeSeal.HARD->type.name.lowercase().replaceFirstChar { ("h");"H" }
            EntityTypeSeal.HELP -> type.name.lowercase().replaceFirstChar { ("h");"H" }
        }
        return when(type){
            EntityTypeSeal.EASY ->EntityEnumClassSeal.Easy(id,name)
            EntityTypeSeal.MEDIUM -> EntityEnumClassSeal.Medium(id,name)
            EntityTypeSeal.HARD -> EntityEnumClassSeal.Hard(id,name,2f)
            EntityTypeSeal.HELP -> EntityEnumClassSeal.Help
        }
    }
}
sealed class EntityEnumClassSeal(){
    object Help:EntityEnumClassSeal(){
        val name="Help"
    }
    data class Easy(val id : String,val name:String):EntityEnumClassSeal()
    data class Medium(val id : String,val name:String):EntityEnumClassSeal()
    data class Hard(val id : String,val name:String, val multiplayer:Float):EntityEnumClassSeal()



}

fun main(){
    val entity:EntityEnumClassSeal=EntityEnumSeal.create(EntityTypeSeal.HARD)
    val msg=when(entity){
        EntityEnumClassSeal.Help -> "help class"
        is EntityEnumClassSeal.Easy -> "easy class"
        is EntityEnumClassSeal.Hard -> "hard class"
        is EntityEnumClassSeal.Medium -> "medium c  lass"
    }

    println(msg)

}