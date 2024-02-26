fun calculateAverage(ages: List<Int>): Double {
    val total = ages.sum()
    return total.toDouble() / ages.size
}

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    return weights.zip(heights).count{ (weight, height) -> weight > 90 && height< 1.50 }
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    val countPerson = ages.count{ it in 11..29 }
    val countHeight = heights.count{ it > 1.90}
    val total = countHeight + countPerson
    val size = ages.size + heights.size

    return ((total.toDouble() / size.toDouble()) * 100).toInt()
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}