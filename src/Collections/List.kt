package Collections

//A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List). For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists. To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}