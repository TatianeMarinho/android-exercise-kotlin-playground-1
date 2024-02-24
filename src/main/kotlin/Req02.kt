fun calculateCommission(salesAmount: Double): Double {
        val commission = salesAmount * 0.04
        return commission
}

fun calculateFinalSalary(baseSalary: Double, commission: Double): Double {
    val salary = baseSalary + commission
    return salary
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}