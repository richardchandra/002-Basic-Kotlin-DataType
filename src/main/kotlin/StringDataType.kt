fun main() {
    //String Data Type
    var firstName:String = "Bruce"
    var lastName:String = "Wayne"
    var address:String = """
        Street Not Yet Done,
        Province Subang,
        Indonesia
    """

    println(firstName)
    println(lastName)
    println(address)
    //To trim the address
    address = """
        |Street Not Yet Done,
        |Province Subang,
        |Indonesia
    """.trimMargin()
    println(address)
    //"|' is the default for .trimIndent(), you can change the indent by inserting the desired indent
    address = """
        >Street Not Yet Done,
        >Province Subang,
        >Indonesia
    """.trimMargin(">")
    println(address)

    //Concatenate String
    var fullName:String = firstName + " " + lastName

    //String template
    var fullName2:String = "$firstName $lastName"
    var desc:String = "total $fullName2 char = ${fullName2.length}"
    println(fullName2)
    println(desc)
}