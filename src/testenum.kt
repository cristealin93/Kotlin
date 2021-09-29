import Model.User

fun main(){

    val number="hard"
    val enumClass=TestEnum.valueOf(number.uppercase())
    println(enumClass.calculateDiscountPercent())

    TestEnum.values().forEach { i->println(i) }

    val test=User("Criste","Alin")
    val fname= User.Chef(12, "AlinC", "Ionut")
    fname.setMyfName("Percase")


}


enum class TestEnum() {
    EASY {
        override fun calculateDiscountPercent()=10
    },
    MEDIUM {
        override fun calculateDiscountPercent()=20


    },
    HARD {
        override fun calculateDiscountPercent()=30


    };
    abstract fun calculateDiscountPercent():Int

}