fun calculateConsumerPrice(factoryCost: Double): Double {
    when {
        factoryCost > 25000.00 -> {
            return (factoryCost * 0.15) + (factoryCost * 0.20) + factoryCost
        }
        factoryCost in 12000.01..25000.00 -> {
            return (factoryCost * 0.10) + (factoryCost * 0.15) + factoryCost
        }
        else -> {
            return (factoryCost * 0.05) + factoryCost
        }
    }
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}