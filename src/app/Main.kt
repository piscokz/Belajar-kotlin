package app

fun main() {
    do {
        restoran()
        print("Lagi ( y / t ) ? ")
        val lagi = readln()
    }
    while (lagi == "y")
    println("\n---------------- PROGRAM SELESAI ----------------\n")


}