package data

open class SmartDevice (
    brandParam : String,
    nameParam : String = "No input",
    typeParam : String = "No input"
) {
    var brand : String = brandParam
    var name : String = nameParam
    var type : String = typeParam

    open fun getAll(){
        println("""          
            |nama brand  : $brand
            |nama produk : $name
            |tipe produk : $type
        """.trimMargin())
    }
}
