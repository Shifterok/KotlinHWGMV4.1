import kotlin.math.roundToInt

//констатны скидок, под системы платежей (Тип карты/счёта)
const val discountVisa = 0.025
const val discountMir = 0.025
const val discountMastercard = 0.04
const val discountMaestro = 0.04
const val discountVkPay = 0

//Функция расчета комиссии transferFounds
fun transferFounds(amount: Double = 12_750.00, whatPaySystem: Int = 2): Double {
    println("Какой картой (платежной системой) будем платить? выберите по номеру из списка:")
    println("1. Visa")
    println("2. МИР")
    println("3. Mastercard")
    println("4. Maestro")
    println("5. Платежной системой VK Pay")

    val finalPrice = when (whatPaySystem) {
        1 -> amount - (amount * discountVisa - 35.00)
        2 -> amount - (amount * discountMir - 35.00)
        3 -> amount - (amount * discountMastercard - 20.00)
        4 -> amount - (amount * discountMaestro - 20.00)
        5 -> amount - amount * discountVkPay
        else -> error("Ошибка... не корректный ввод")
    }
    val amountOfTransaction = (finalPrice * 100.0).roundToInt() / 100.0
    println("Вы успешно перевели: $amountOfTransaction рублей")
    return amountOfTransaction
}

fun main() {
    //Проверка лимиотов совершенных переводов
    println("Укажите обущю сумму совершенных Вами переводов за день:")
    val amountAtDay = readLine()!!.toDouble()
    println("Укажите обущю сумму совершенных Вами переводов за месяц:")
    val amountAtMounth = readLine()!!.toDouble()
    if (amountAtDay >= 150_000.00 || amountAtMounth >= 600_000.0) {
        println("Лимиты переводов превышены, операция отменена")
    } else {
        transferFounds()
    }
}