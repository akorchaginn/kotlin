package airline

open class PassengerAircraft(
        _manufacturer: String,
        _model: String,
        _range: Int,
        _tankCapacity: Int
    ): Aircraft(_manufacturer, _model, _range, _tankCapacity), PassengerInterface {

    override var seats: Int = 0

    override fun info(): String {
        return super.info() + ", число мест: $seats."
    }
}