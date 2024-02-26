fun calculateNewSalary(currentSalary: Double): Double {
    when {
        currentSalary <= 300.00 -> {
            return currentSalary + (currentSalary * 0.50)
        }
        currentSalary in 300.01..500.00 -> {
            return currentSalary + ( currentSalary * 0.40)
        }
        currentSalary in 500.01..700.00 -> {
            return currentSalary + ( currentSalary * 0.30)
        }
        currentSalary in 700.01..800.00 -> {
            return currentSalary + ( currentSalary * 0.20)
        }
        currentSalary in 800.01..1000.00 -> {
            return currentSalary + ( currentSalary * 0.10)
        }
        else -> {
            return currentSalary + ( currentSalary * 0.05)
        }
    }
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}