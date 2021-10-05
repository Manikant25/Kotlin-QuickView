package `Scope-Functions`

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}
//apply executes a block of code on an object and returns the object itself. Inside the block, the object is referenced by this. This function is handy for initializing objects.
fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription).also {
        println("Manikant is so Cool")
    }
}