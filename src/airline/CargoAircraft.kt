package airline

class CargoAircraft(
            _manufacturer: String,
            _model: String,
            _range: Int,
            _tankCapacity: Int
            ): Aircraft(_manufacturer, _model, _range, _tankCapacity) {
    var cargoCapacity: Int = 0

    override fun info(): String {
        return super.info() + ", грузоподъёмность $cargoCapacity кг."
    }
}