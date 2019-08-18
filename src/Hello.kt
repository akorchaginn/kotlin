fun main (args: Array<String>) {
    println("Hello, world)")

//Задание 1
    var someVar: Any?
    someVar = 326
    var doubleVar = someVar / 2.5

    println(doubleVar::class.qualifiedName)

//Задание 2
    val hello: String = "Hello"
    val aplana: String = "Aplana"

    print("$hello $aplana!")

//Задание 3

    var five: Char = '5'

    var fiveString = five.toString()
    var fiveByte = fiveString.toByte()
    var fiveShort = fiveString.toShort()
    var fiveInt = fiveString.toInt()
    var fiveDouble = fiveString.toDouble()
    var fiveFloat = fiveString.toFloat()
    var fiveLong = fiveString.toLong()

    println("\n" + fiveShort + (fiveByte + fiveLong * fiveInt) / fiveDouble + fiveFloat)
}