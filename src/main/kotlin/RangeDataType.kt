fun main() {
    //Range Data Type
    //Array that have incrementing value
    val range = 1..100

    //Range operation
    //Count range
    println( range.count())

    //Find if value exists
    println(range.contains(50))

    //Finding the first value
    println(range.first)

    //Finding the last value
    println(range.last)

    //Finding the number of increment
    println(range.step)


    //Downwards range
    val secondRange = 1000 downTo 1

    //Change increment step
    val thirdRange = 100 downTo 1 step 2
    println(thirdRange.count())
}