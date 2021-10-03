package Functions

//Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.

fun printAll(vararg messages :String)
{
    for(i in messages)
        println(i)
}

fun main()
{
    operator fun Int.times(str:String)= str.repeat(this)

    print(2 * "Manikant Rai ")
    printAll("Hi","Hello Mani","Hello Manikant", "Hello Everyone")

    //Null Safety
    val neverNull :String? =null

}