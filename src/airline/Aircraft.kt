package airline

abstract class Aircraft(_manufacturer: String, _model: String, _range: Int, _tankCapacity: Int) {
    protected var manufacturer: String = _manufacturer
    protected var model: String = _model
    protected var range: Int = _range
    protected var tankCapacity: Int = _tankCapacity
    protected val fuelPer100: Double
        get() = (tankCapacity.toDouble() / range.toDouble() * 100)

    open fun info(): String{
        return "Самолёт: $manufacturer $model, расход топлива на 100 км: $fuelPer100"
    }
}