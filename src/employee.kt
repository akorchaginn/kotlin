fun employeeCount(vararg employees: String): Int {
    var i = 0
    for (employee in employees) {
        i += 1
    }
    return i
}
