fun employeeInfo(fio: String, position: String): String {
    return "ФИО: $fio, возраст:??, семейное положение:??, должность: $position"
}

fun employeeInfo(fio: String, age: Int, position: String): String {
    return "ФИО: $fio, возраст: $age, семейное положение:??, должность: $position"
}

fun employeeInfo(fio: String, maritalStatus: String, position: String): String {
    return "ФИО: $fio, возраст:??, семейное положение: $maritalStatus, должность: $position"
}

fun employeeInfo(fio: String, age: Int, maritalStatus: String, position: String): String {
    return "ФИО: $fio, возраст: $age, семейное положение: $maritalStatus,  должность: $position"
}