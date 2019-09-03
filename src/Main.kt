import airline.AircraftMenu
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
        println("7 - Високосный год")
        println("8 - Сколько сотрудников?")
        println("9 - Информация о сотруднике")
        println("10 - Лямбда")
        println("11 - Квадратный корень из 16")
        println("12 - Авиакомпания. Информация о самолётах")
        println("13 - Data class")
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
            "3" -> deposit()

            //Задание 9
            "4" -> countries()

            //Задание 10
            "5" -> cities()

            //Задание 11
            "6" -> workPlace()

            //Задание 12
            "7" -> {
                val whatIsYear = WhatIsYear()
                println(whatIsYear.isGregorianYear())
            }

            //Задание 13
            "8" -> {
                println("Передано " + employeeCount("Иванов", "Ли", "Бернар", "Смит", "Абрамов", "Ким").toString() + " фамилий.")
            }

            //Задание 14
            "9" -> {
                println(employeeInfo("Иванов Иван Иванович", "Ведущий специалист"))
                println(employeeInfo("Петров Пётр Петрович", 35, "Бухгалтер"))
                println(employeeInfo("Сидоров Сидор Сидорович", "Женат", "Начальник отдела снабжения"))
                println(employeeInfo("Сергеев Сергей Сергеевич", 20, "Холост", "Водитель-экспедитор"))
            }

            //Задание 15
            "10" -> {
                lambda()
            }

            //Задание 16
            "11" -> {
                val x1 = 16.0
                println(x1.squareRoot())
            }

            //Задание 17-22, 24
            "12" -> {
                val aircraftMenu = AircraftMenu()
                aircraftMenu.menu()

            }

            //Задания 23
            "13" -> {
                val car1 = Car("Audi A6", "White", "А123БВ")
                val car2 = Car("Mercedes C180", "Red", "О555ОО")
                val car3 = Car("Lada Kalina", "Yellow", "П001ВВ")

                println(car1.toString())
                println(car2.toString())
                println(car3.toString())
            }
        }
    }
}