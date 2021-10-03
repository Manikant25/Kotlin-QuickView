package Classes

open class Lion(val name :String, val origin :String)
{
    fun sayHello()
    {
        println("$name, the lion is from $origin says:graoh")
    }
}

class Asiatic(name:String):Lion(name=name,origin = "India")

fun main() {
    val lion = Asiatic("Rufo")
    lion.sayHello()
}
