package contions

fun cases(obj :Any)
{  //When Statement
    when(obj){
        1-> println("One")
        "Hello"->println("Greeting")
        else -> println("Unknown")
    }
}

//When expression
fun whenAssign(obj :Any) :Any
{
    val result = when(obj){
        1-> "One"
        "Hello" -> "String"
        is Long -> false
        else ->42
    }
    return result
}

fun main() {
    cases(1)
    cases("Hello")
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
}