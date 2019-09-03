package airline

import airline.plain.*
import kotlin.system.exitProcess

class AircraftMenu {
    fun menu(){
        var i = "9999"

        while (i!="0"){
            println("Вы находидесь в меню просмотра информации о самолётах.")

            println("1 - ATR-72")
            println("2 - Airbus A330-200")
            println("3 - Airbus A330-200F")
            println("4 - Boeing 747-8 Freighter")
            println("5 - АН-124-100")
            println("5 - SSJ-100-95LR")
            println()
            println("0 - Выход на уровень выше")
            println("00 - Выход из приложения")
            print("Выберите интересующий тип самолёта:")

            i = readLine().toString()
            when(i){

                "1" -> {
                    val plain = ATR72()
                    println(plain.info())
                    }

                "2" -> {
                    val plain = AirbusA330200()
                    println(plain.info())
                }

                "3" -> {
                    val plain = AirbusA330200F()
                    println(plain.info())
                }

                "4" -> {
                    val plain = Boeing7478F()
                    println(plain.info())
                }

                "5" -> {
                    val plain = AN124100()
                    println(plain.info())
                }

                "6" -> {
                    val plain = SSJ100()
                    println(plain.info())
                }

                "00" -> exitProcess(0)
            }
        }
    }
}