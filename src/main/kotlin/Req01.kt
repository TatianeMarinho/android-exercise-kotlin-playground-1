fun calculateDiscount(originalPrice: Double): Double {
    val value = originalPrice * 0.10
    return value;
}

fun main() {
        println("Qual o valor a calcular? ")
        val originalPrice = readline().toDoubleOrNull()
        println("o total é $originalPrice")
}