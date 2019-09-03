package airline.plain

import airline.PassengerAircraft

class SSJ100: PassengerAircraft("АО \"ГСС\"","Sukhoi Superjet 100-95LR", 4578, 15805) {
    override var seats: Int = 98
}