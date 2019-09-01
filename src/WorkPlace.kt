import kotlin.system.exitProcess

fun workPlace() {
    var i = "9999"

    val workPlaces: MutableMap<String, String> = mutableMapOf("A1" to "Иванов Иван", "C5" to "Петров Пётр", "D1" to "Сидоров Сидор")

    while (i!="0"){
        println("1 - Добавить/заменить сотрудника на рабочее место")
        println("2 - Список всех рабочих мест")
        println("3 - Поиск сотрудника по номеру рабочего места")
        println()
        println("0 - Выход на уровень выше")
        println("00 - Выход из приложения")
        print("Выберите пункт меню:")

        i = readLine().toString()
        when(i){

            "1" -> {
                print("Введите номер рабочего места: ")
                val placeNumber: String? = readLine()

                print("Введите номер ФИО сотрудника: ")
                val employee: String? = readLine()

                if (placeNumber != null && employee != null) {
                    workPlaces[placeNumber] = employee
                }

            }

            "2" -> {
                println(workPlaces.toString())
            }

            "3" -> {
                print("Введите номер рабочего места: ")
                val placeNumber: String? = readLine()

                if (placeNumber != null) {
                    val employee = workPlaces[placeNumber]
                    println(employee?:"Not found")
                }
            }

            "00" -> exitProcess(0)
        }
    }
}