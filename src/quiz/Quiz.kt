package quiz

import java.util.*
import kotlin.collections.ArrayList

class Quiz {

    private var points:Int = 0

    fun getResult() {
        when(points) {
            0, 1, 2 ->  print("Неудовлетворительно! ")
            3, 4 ->  print("Удовлетворительно! ")
            5 ->  print("Хорошо! ")
            6 ->  print("Отлично! ")
        }
        println("Ваш результат $points баллов из 6.")
    }

    fun quiz(){
        val questions = this.getQuestionData()
        questions.shuffle()
        val questionsIterator = questions.iterator()
        for (quest in questionsIterator) {
            println(quest.quest())
            println(Arrays.toString(quest.hint()))
            val answer: String? = readLine()
            if (answer == quest.correctAnswer()) {
                points++
            }
        }
    }

    private fun getQuestionData(): ArrayList<Question> {
        return arrayListOf(
                Question("Сколько колец на олимпийском флаге?", "5", arrayOf("5", "4", "7")),
                Question("Нос какого мальчика растет, когда он говорит неправду?", "Пиноккио", arrayOf("Питер Пенн", "Чиполлино", "Пиноккио")),
                Question("Кто плавал на \"Нинье\", \"Пинте\" и \"Санта-Марии\"?", "Христофор Колумб", arrayOf("Христофор Колумб", "Джек Воробей", "Фернан Магелан")),
                Question("Какое из этих чисел является простым?","5", arrayOf("12", "5", "25")),
                Question("Какая планета известна своими кольцами?", "Сатурн", arrayOf("Земля", "Сатурн", "Юпитер")),
                Question("В каком фрукте больше витамина C, чем в апельсинах?", "Клубника", arrayOf("Банан", "Клубника", "Арбуз"))
        )
    }
}