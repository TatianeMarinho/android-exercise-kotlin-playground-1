fun calculateSumEven(numbers: List<Int>): Int {
    var sum = 0
    numbers.forEach{
        if (it % 2 == 0) {
            sum += it
        };
    }
    return sum
}

fun calculateSumOdd(numbers: List<Int>): Int {
    var sum = 0
    numbers.forEach{
        if (it % 2 != 0) {
            sum += it
        };
    }
    return sum
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}