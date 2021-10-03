package Classes

class Customer(val id :Int,val email:String) {
}

fun main() {
    val customer = Customer(1,"manikant.rai2000@gmail.com")
    println(customer.email)
}