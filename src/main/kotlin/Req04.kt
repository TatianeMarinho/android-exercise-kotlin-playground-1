fun calculateAverage(number1: Double, number2: Double): Double {
    val average = (number1 + number2) / 2
    return average
}

fun calculateDifference(number1: Double, number2: Double): Double {
    val difference = if (number1 > number2) number1 - number2 else number2 - number1
    return difference
}

fun calculateProduct(number1: Double, number2: Double): Double {
    val product = number1 * number2
    return product
}

fun calculateDivision(number1: Double, number2: Double): Double? {
    val division = number1 / number2
    return division
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}