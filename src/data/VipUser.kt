package data

class VipUser(
    override val firstName: String,
    override val lastName: String = ""
) : User {
    override var fullName: String = username()
}


