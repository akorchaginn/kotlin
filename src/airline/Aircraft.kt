package airline

class Aircraft(_manufacturer: String, _model: String, _range: Int, _tankCapacity: Int) {
    var manufacturer: String = _manufacturer
    var model: String = _model
    var range: Int = _range
    var tankCapacity: Int = _tankCapacity
    val fuelPer100: Double
        get() = (tankCapacity.toDouble() / range.toDouble() * 100)
}