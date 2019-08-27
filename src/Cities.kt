import kotlin.system.exitProcess

fun cities(){
    var i = "9999"

    var cities: List<String> = listOf()

    while (i!="0"){
        println("1 - Добавить город")
        println("2 - Список городов")
        println("3 - Список уникальных значений")
        println()
        println("0 - Выход на уровень выше")
        println("00 - Выход из приложения")
        print("Выберите пункт меню:")

        i = readLine().toString()
        when(i){

            "1" -> {
                print("Введите название города: ")
                val cityName: String? = readLine()
                if (cityName != null) {
                    cities += cityName
                }

            }

            "2" -> {
                println(cities.toString())
            }

            "3" -> {
                cities.stream().distinct().forEach(System.out::println)
            }

            "00" -> exitProcess(0)
        }
    }
}

