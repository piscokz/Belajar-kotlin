package data

interface User {
    val firstName: String
    val lastName: String
    var fullName: String

    fun username(): String {
        val fullName : String = when {
            firstName.isNotEmpty() && lastName != "" -> {
                "$firstName $lastName"
            }
            (this.lastName == "") -> {
                firstName
            }
            else -> {"ada yang salah"}
        }
        return fullName
    }

    fun sayHello(string: String) {
        println(
            """          
            |halo $string, saya ${this.fullName}
        """.trimMargin()
        )
    }
}