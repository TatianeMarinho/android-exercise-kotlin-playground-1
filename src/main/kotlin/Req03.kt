fun calculateYears(birthYear: Int, currentYear: Int): Int {
   val age = currentYear - birthYear
    return age
}

fun calculateMonths(birthYear: Int, currentYear: Int): Int {
    val age = calculateYears(birthYear, currentYear) * 12
    return age
}

fun calculateDays(birthYear: Int, currentYear: Int): Long {
    var ageDays = 0
    for (year in birthYear  until currentYear) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            ageDays += 366
        } else {
            ageDays += 365
        }
    }
    return ageDays.toLong()
}

fun calculateWeeks(birthYear: Int, currentYear: Int): Long {
    val age = calculateDays(birthYear, currentYear) / 7
    return age
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}