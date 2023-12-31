package data

interface User {
    val firstName: String
    val lastName: String
    var fullName: String

    fun username(): String {
        val fullName : String = when {
            this.firstName.isNotEmpty() && this.lastName != "" -> {
                "${this.firstName} ${this.lastName}"
            }
            (this.lastName == "") -> {
                this.firstName
            }
            else -> {"ada yang salah"}
        }
        this.fullName = fullName
        return this.fullName
    }

    fun sayHello(string: String) {
        println(
            """          
            |halo $string, username saya ${this.fullName}
        """.trimMargin()
        )
    }
}


class RegularUser(
    override val firstName: String,
    override val lastName: String = ""
) : User {
    override var fullName: String = username()
}

class VipUser(
    override val firstName: String,
    override val lastName: String = ""
) : User {
    override var fullName: String = username()
}


