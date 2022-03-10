fun main() {
    //Array Data Type
    //Array is a collection of value with same data type
    val members:Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values:Array<Byte> = arrayOf(100, 95, 90)
    val balances:Array<Int> = arrayOf(10_000, 20_000, 30_000)

    //Array have index for each value
    //To get the value by index
    println(members.get(0))
    println(members[0])

    //Array operation
    //Find array size
    println(members.size)

    //Change array value by index
    members.set(0, "Bruce")
    println(members[0])

    //Fun fact, we can change array that been declared with val
    val nameList:Array<String> = arrayOf("Bruce", "Clark", "Tony")

    //What can't be change with val is variable name, not the value
    nameList.set(2, "Diana")
    println(nameList[2])

    //Array nullable
    //We can assign null to array value
    //But we must define the array size
    val classParticipants:Array<String?> = arrayOfNulls(5)
    classParticipants.set(0, "Tony")
    classParticipants.set(2, "Bruce")
    classParticipants.set(4, "Thor")
    println(classParticipants[1])
}