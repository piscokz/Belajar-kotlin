package data

class RegularUser(
    override val firstName: String,
    override val lastName: String = ""
) : User {
    override var fullName: String = username()
    override fun sayHello(string: String) {
        println("halo $string, saya Regular User : $fullName")
    }
}