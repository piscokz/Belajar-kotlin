package data

open class Person (
    firstNameParam : String = "",
    lastNameParam: String = "") {
    var firstName = firstNameParam
    var lastName = lastNameParam
    var fullName = "$firstName $lastName"
    open fun sayHello(name : String){
        println("""          
            |halo $name, nama saya $fullName
        """.trimMargin())
    }
}
