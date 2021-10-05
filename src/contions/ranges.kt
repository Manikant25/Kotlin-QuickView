package contions

import java.util.Collections.max
import kotlin.math.max

fun main() {
    for (i in 0..3)
        println(i)

    println(" ")

    for (i in 0 until 3)
        print(i)
    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0)
        print(i)

    print(" ")

    for (c in 'a'..'d') {        // 1
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }

//    Ranges are also useful in if statements:
    val x =2
    if(x in 1..5){
        print("X is in the range from 1 to 5")
    }
    println()

    if(x !in 6..10){
        print("x is not in range from 6 to 10")
    }

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2

    println(max(99,0))
}