package airline

abstract class Aircraft(_manufacturer: String, _model: String, _range: Int, _tankCapacity: Int) {
    private var manufacturer: String = _manufacturer
    private var model: String = _model
    private var range: Int = _range
    private var tankCapacity: Int = _tankCapacity
    private val fuelPer100: Double
        get() = (tankCapacity.toDouble() / range.toDouble() * 100)

    open fun info(): String{
        return "Самолёт: $manufacturer $model, расход топлива на 100 км: $fuelPer100"
    }
}