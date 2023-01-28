package SequenciaBasica

const val REAL = 5.17

fun main() {

    println("Quanto dinheiro tens na carteira R$?")
    val wallet = readLine()?.replace(",",".")?.toDouble()

val buyDolar = wallet!! / REAL

    println(String.format("Com R$%.2f \n"
               + "tu pode comprar $%.2f",wallet,buyDolar))


}