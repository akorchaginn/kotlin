package airline.plain

import airline.PassengerAircraft

class AirbusA330200: PassengerAircraft("Airbus", "A330-200", 13400, 139090) {
    override var seats: Int = 293
}