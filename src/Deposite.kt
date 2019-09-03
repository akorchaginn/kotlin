import kotlin.math.roundToInt

fun deposit() {
    print("Введите срок вклада: ")
    val periodS: String? = readLine()

    print("Введите сумму вклада: ")
    val sumS: String? = readLine()

    print("Введите процентную ставку: ")
    val percentS: String? = readLine()

    val period: Int = periodS!!.toInt()
    var sum: Double = sumS!!.toDouble()
    val percent: Double = percentS!!.toDouble()
    var delta: Double

    println("Сумма в день вклада $sum")
    for (x in 1..period) {
        delta = (sum * (percent / 12 / 100) * 100).roundToInt() / 100.00
        sum += delta
        println("Месяц $x, накопленная сумма с процентами $sum, прирост $delta.")
    }

}