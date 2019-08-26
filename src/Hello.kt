fun hello () {
    println("Hello, world)")

//Задание 1
    val someVar: Any?
    someVar = 326
    val doubleVar = someVar / 2.5

    println(doubleVar::class.qualifiedName)

//Задание 2
    val hello = "Hello"
    val aplana = "Aplana"

    print("$hello $aplana!")

//Задание 3
    val five = '5'

    val fiveString = five.toString()
    val fiveByte = fiveString.toByte()
    val fiveShort = fiveString.toShort()
    val fiveInt = fiveString.toInt()
    val fiveDouble = fiveString.toDouble()
    val fiveFloat = fiveString.toFloat()
    val fiveLong = fiveString.toLong()

    println("\n" + fiveShort + (fiveByte + fiveLong * fiveInt) / fiveDouble + fiveFloat)

//Задание 4
    println("Hi! Please, enter your name:")
    val userName: String? = readLine()

    println("Hi $userName!")

//Задание 5
    val alphabet = 'z' downTo  'a'

    println("Please, enter the number of the letter you want to see:")
    val alphabetElement: String? = readLine()

    println(alphabet.elementAt(alphabetElement?.toInt()?:0))

//Задание 6
    println("Please, enter the a number:")
    val a: String? = readLine()

    println("Please, enter the b number:")
    val b: String? = readLine()

    val result = a?.toInt()?:0 > b?.toInt()?:0
    println(result)

}
