package Classes

open class Tiger(val origin :String)
{
    fun sayHello(){
        println("A tiger from $origin says : grrrhhh!!!")
    }
}

class SiberainTiger : Tiger("Siberian")

fun main() {
    val tiger = SiberainTiger()
    tiger.sayHello()
}
