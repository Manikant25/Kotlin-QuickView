
fun printMessage(message : String):Unit {
    println(message)
}

fun printMessageWithPrefix(message:String , prefix :String = "Info")
{
    println("$prefix $message")
}

fun sum(X:Int,Y:Int) = X +Y

fun main() {

    printMessage("Manikant is Great")
    printMessageWithPrefix("Manikant", "Mr")
    println(sum(100,20))

}