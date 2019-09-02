package airline

class Aircraft {
    var manufacturer: String = ""
    var model: String = ""
    var range: Int = 0
    var tankCapacity: Int = 0
    val fuelPer100: Double
        get() = (tankCapacity.toDouble() / range.toDouble() * 100)
}