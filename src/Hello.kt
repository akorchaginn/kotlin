import quiz.Quiz

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

//Задание 4
    println("Hi! Please, enter your name:")
    var userName: String? = readLine()

    println("Hi $userName!")

//Задание 5
    var alphabet = 'z' downTo  'a'

    println("Please, enter the number of the letter you want to see:")
    var alphabetElement: String? = readLine()

    println(alphabet.elementAt(alphabetElement?.toInt()?:0))

//Задание 6
    println("Please, enter the a number:")
    var a: String? = readLine()

    println("Please, enter the b number:")
    var b: String? = readLine()

    var result = a?.toInt()?:0 > b?.toInt()?:0
    println(result)

//Задание 7
    val quiz: Quiz = Quiz()
    quiz.quiz()
    quiz.getResult()

//Задание 8
    deposite()

//Задание 9
    countries()
}
