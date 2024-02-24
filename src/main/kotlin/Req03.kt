fun calculateYears(birthYear: Int, currentYear: Int): Int {
   val age = currentYear - birthYear
    return age
}

fun calculateMonths(birthYear: Int, currentYear: Int): Int {
    val age = calculateYears(birthYear, currentYear) * 12
    return age
}

fun calculateDays(birthYear: Int, currentYear: Int): Long {
    val age = (calculateMonths(birthYear, currentYear)).toLong() * 365
    return age
}

fun calculateWeeks(birthYear: Int, currentYear: Int): Long {
    val age = calculateDays(birthYear, currentYear) / 7
    return age
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}