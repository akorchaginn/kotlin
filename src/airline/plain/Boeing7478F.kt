package airline.plain

import airline.CargoAircraft

class Boeing7478F: CargoAircraft("Boeing", "747-8 Freighter", 8130, 241140) {
    override var cargoCapacity: Int = 140000
}