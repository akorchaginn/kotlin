package airline.plain

import airline.PassengerAircraft

class ATR72: PassengerAircraft("ATR", "72-500", 1324, 6974) {
    override var seats: Int = 74
}