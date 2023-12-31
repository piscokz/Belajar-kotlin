package app

import data.Person


fun newLine(){ println("\n") }

fun main () {
    newLine()

    val product1 = Person("muhammad", "fariyd")
    product1.sayHello("setia budi")
    newLine()

    val product2 = Person("setia", "budi")
    product2.sayHello(product1.fullName)
    newLine()

    val product3 = Person("Nothing")
    product3.sayHello("piscokz")
    newLine()
}