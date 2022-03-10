fun main(args: Array<String>) {
    //Integer Number
    //**Byte**
    //--Min Value -128--Max Value 127--
    var age:Byte = 30

    //**Short**
    //--Min Value -32768--Max Value 32767--
    var distance:Short = 178

    //**Integer**
    //--Min Value -2,147,483,648--Max Value 2,147,483,647--
    var height:Int = 170

    //**Long**
    //--Min Value -9,223,,372,036,854,775,808--Max Value 9,223,,372,036,854,775,807--
    var balance:Long = 100000000L


    //Floating Point Number
    //**Float**
    //--Size 32 bits--Significant Bits 24--Exponent Bits 8--Decimal Digits 6-7--
    var value:Float = 98.98F

    //**Double**
    //--Size 64 bits--Significant Bits 53--Exponent Bits 11--Decimal Digits 15-16--
    var radius:Double = 23423423423.54354


    //Literals
    //Will return integers
    var decimalLiteral:Int = 100
    var hexadecimalLiteral:Int = 0xFF
    var binaryLiteral:Int = 0b10110101


    //Underscore feature
    //Only separate the number for readers, not the machines
    var age_2:Byte = 3_0
    var height_2:Int = 1_7_0
    var distance_2:Short = 2_000
    var balance_2:Long = 100_000_000L


    //Conversion
    var number:Int = 100
    var byte:Byte = number.toByte()
    var short:Short = number.toShort()
    var int:Int = number.toInt()
    var long:Long = number.toLong()
    var float:Float = number.toFloat()
    var double:Double = number.toDouble()

    //Beware of the maximum value each data type have
    var price:Long = 9_000_000_000L
    var priceInt:Int = price.toInt()
    //->The result will not be 9,000,000,000 as Int max value is below 9,000,000,000
    //->The result will be 410,065,408
    //->Convert process: 0 -> Max Int Value -> Min Int Value -> Max Int Value -> Min Int Value -> Leftover

}