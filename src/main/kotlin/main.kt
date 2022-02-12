fun main() {
    val penny = 100
    val minCommission = 35 * penny
    val commission = 0.0075
    val amount = 100 * penny


    var result = if (amount * commission <= minCommission) {
        minCommission.toDouble()
    } else {
        amount * commission
    }
    println(result)
}