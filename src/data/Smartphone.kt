package data

class Smartphone(brandParam: String, nameParam: String, var zoomCamera: Boolean = false) : SmartDevice(brandParam, nameParam, "Smartphone") {
    override fun getAll() {
        println(
            """          
            |nama brand  : $brand
            |nama produk : $name
            |tipe produk : $type
            |zoom camera : $zoomCamera
        """.trimMargin()
        )
    }
}