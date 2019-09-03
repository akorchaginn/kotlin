package airline.plain

import airline.CargoAircraft
class AirbusA330200F: CargoAircraft("Airbus", "A330-200F", 7400, 139090) {
    override var cargoCapacity: Int = 65000
}