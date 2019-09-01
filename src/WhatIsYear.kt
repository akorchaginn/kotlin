class WhatIsYear{
    fun isGregorianYear(): String{
        print("Введите номер года:")
        val year: String? = readLine()
        if ((null == year) or ("" == year)) {
            return "Error! It is not a year number!"
        }
        val yearInt: Int = year!!.toInt()
        return when (isLeap(yearInt)) {
                0 -> "It is leap year!"
            else -> "It is not a leap year!"
        }
    }

    private fun isLeap(year: Int): Int{
        return year.rem(4)
    }
}