package Functions

//Member functions and extensions with a single parameter can be turned into infix functions.

//Defines an infix extension function on Int.
infix fun Int.times(str:String) = str.repeat(this)

infix fun String.onto(other:String) = Pair(this,other)

fun main() {

    println(2 times "Bye ")
    println(5 times "Mani ")
//    Creates a Pair by calling the infix function to from the standard library.
    val pair  ="Ferrari" to "Lamborghini"
    println(pair)

    val mypair = "Manikant" onto "Rai"
    println(mypair)




}