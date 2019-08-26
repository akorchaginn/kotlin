import quiz.Quiz

fun main(){

    var i = "9999"

    while (i!="0"){
        println("1 - Hello Kotlin")
        println("2 - Тест")
        println("3 - Расчёт вклада")
        println("4 - Массив стран")
        println("5 - Города")
        println("6 - Рабочие места")
        println()
        println("0 - Выход")
        println("Выберите пункт меню:")

        i = readLine().toString()
        when(i){

            //Задания 1-6
            "1" -> hello()

            //Задание 7
            "2" -> {
                val quiz = Quiz()
                quiz.quiz()
                quiz.getResult()
            }

            //Задание 8
            "3" -> deposite()

            //Задание 9
            "4" -> countries()

            //Задание 10
            "5" -> cities()
        }
    }
}