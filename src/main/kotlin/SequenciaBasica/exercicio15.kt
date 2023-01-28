package SequenciaBasica

const val hourDay = 8
const val hourWork = 25

fun main() {

    println("Quantos dias voce trabalhou em um mes? ")
    val day = readLine()?.toInt()

    val salary = (hourDay * hourDay) * day!!

    println("Ganha $salary")




}