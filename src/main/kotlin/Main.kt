import java.util.Scanner

fun main() {
    val minCommission = 3500// в копейках
    val standartCommission = 0.75 //в процентах
    var commission = 0

    println("Добро пожаловать в программу перевода денег!")
    val scan = Scanner(System.`in`)
    while (true) {
        println("Введите сумму перевода:")
        val amount = scan.nextInt()
        if (amount <= minCommission / 100) {
            println("Минимальная комиссия за перевод составляет: 35 руб, введите сумму больше минимальной комиссии")
            continue
        } else {
            commission = (amount * standartCommission).toInt()
            if (commission < minCommission / 100) {
                commission = 35
            }
        }

        println(commission)

    }
}