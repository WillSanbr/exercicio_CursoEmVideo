package SequenciaBasica

const val DAYCR = 90
const val KMRolled = 0.20

fun main() {

    println("Quantos Quilometros(Km) foram percorrida com carro? ")
    val carsKm = readLine()?.replace(",",".")?.toDouble()

    println("Quantos dias o carro foi alugado? ")
    val carsDay = readLine()?.replace(",",".")?.toInt()

    val totalyKm: Double = carsKm!! * KMRolled
    val totalyDay:Double = (carsDay!! * DAYCR).toDouble()

     val priceRent = totalyDay + totalyKm

    println(String.format("O preço do aluguel do carro é R$%.2f",priceRent))




}