package quiz

class Question (_quest: String, _correctAnswer: String, _hint: Array<String>){
    private val quest: String = _quest
    private val correctAnswer: String = _correctAnswer
    private val hint: Array<String> = _hint

    fun quest() = quest
    fun correctAnswer() = correctAnswer
    fun hint() = hint

}