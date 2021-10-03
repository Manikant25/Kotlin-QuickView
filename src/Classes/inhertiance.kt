package Classes

open class Dog {
    open fun sayHello()  //Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them
    {

        println("wow wow!")
    }
}

class Yorkshire : Dog()
{
   override fun sayHello() {
       super.sayHello()
        println("wif wif")
    }
}

fun main() {
    val dog :Dog = Yorkshire()
    dog.sayHello()
}