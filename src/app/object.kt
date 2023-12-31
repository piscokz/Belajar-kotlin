package app


import data.RegularUser
import data.VipUser
fun newLine(){ println("\n") }

fun main () {

    val user1 = VipUser("muhammad", "fariyd")
    val user2 = RegularUser("setia", "budi")
    val user3 = RegularUser("Dimas")
    newLine()

    println(user1.fullName)
    user2.sayHello(user1.fullName)
    println(user3.fullName)
    newLine()

}