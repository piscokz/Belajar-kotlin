package app

import data.SmartDevice
import data.Smartphone

fun newLine(){ println("\n") }

fun main () {

    newLine()

    val product1 = Smartphone("Samsung", "S24")
    product1.zoomCamera = true
    product1.getAll()
    newLine()

    val product2 = SmartDevice("Apple","Macbook Pro 14 M3 Max","Laptop")
    product2.getAll()
    newLine()

    val product3 = SmartDevice("Nothing")
    product3.getAll()
    newLine()
}