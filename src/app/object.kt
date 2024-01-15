package app

fun ouputPerson() : String {
    println("--------- SELAMAT DATANG !! ---------")

    print("Masukkan Nama : ")
    val nama = readln()

    print("Masukkan Umur : ")
    val umur = readln().toInt()

    println("1 laki-laki / 2 perempuan")
    print("masukkan angka gender : ")
    val gender = readln()


    val output = when {

        umur == 69 -> """
            ${nama.uppercase()} the greatest 69th of life
            
            ___ ___
             0   0
              www
              
              
        """.trimIndent()

        umur <= 10 -> """
            Halo dek $nama
            
            ___  ___
              0    0
               ////
        """.trimIndent()

        umur <= 20 && gender == "1" -> "halo bang $nama"
        umur <= 30 && gender == "1" -> "halo mas $nama"
        umur > 30 && gender == "1" -> "halo pak $nama"

        umur <= 30 && gender == "2" -> "halo kak $nama"
        umur > 30 && gender == "2" -> "halo bu $nama"


        else -> {"bermasalah"}

    }

    return output
}
fun main() {
    println( ouputPerson())

}