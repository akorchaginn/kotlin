package airline.plain

import airline.CargoAircraft

class AN124100: CargoAircraft("ГП \"Антонов\"", "АН-124-100 (Руслан)", 4800, 212350) {
    override var cargoCapacity: Int = 120000
}