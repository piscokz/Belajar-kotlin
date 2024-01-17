package app

fun inputOutput(): Unit {
    println("\n--------- SELAMAT DATANG !! ---------\n")

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
               ///
               
        """.trimIndent()

        umur <= 20 && gender == "1" -> "halo bang $nama"
        umur <= 30 && gender == "1" -> "halo mas $nama"
        umur > 30 && gender == "1" -> "halo pak $nama"

        umur <= 30 && gender == "2" -> "halo kak $nama"
        umur > 30 && gender == "2" -> "halo bu $nama"


        else -> {
            "bermasalah"
        }

    }

    println(output)
}


fun restoran() {
    val listMakanan: List<String> = listOf(
        "Ayam goreng",
        "Telor ceplok",
        "Ayam bakar"
    )
    val listHargaMakanan: List<Int> = listOf(10_000, 5_000, 12_500)
    val saldo: Int = 100_000


    println("\n\n---------------- SELAMAT DATANG DI RESTORAN HAJI DJ ----------------")

    println("List menu makanan kami : \n")

    var i = 0
    while (i < listMakanan.size) {
        println("${i + 1}. ${listMakanan[i]} RP. ${listHargaMakanan[i]}")
        i++
    }

    println("\nSALDO ANDA : $saldo\n")
    print("pilih nomor menu : ")
    val request = readln()

    print("berapa banyak ${listMakanan[request.toInt() - 1]}: ")
    val banyakRequest = readln()

    val bayar = listHargaMakanan[request.toInt() - 1] * banyakRequest.toInt()
    val hasil = saldo - bayar
    println("""
        
        request    = ${listMakanan[request.toInt() - 1]} ${banyakRequest}x
        bayar      = $saldo (saldo) - ${bayar} (${listMakanan[request.toInt() - 1]} x $banyakRequest)
        sisa saldo = $hasil 
        
    """.trimIndent())

}

