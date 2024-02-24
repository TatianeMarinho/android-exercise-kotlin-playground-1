fun calculateDiscount(originalPrice: Double): Double {
    TODO(
        val value = originalPrice * 0.10
        println("Total a pagar é $value")
    )
}

fun main() {
    TODO(
        println("Qual o valor a calcular? ")
        val originalPrice = readline().toDoubleOrNull()
        calculateDiscount(originalPrice)
    )
}
