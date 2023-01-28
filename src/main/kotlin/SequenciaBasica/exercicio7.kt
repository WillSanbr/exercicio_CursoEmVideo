package SequenciaBasica

fun main() {

    println("Digite um numero: ")
    val number = readLine()?.toDouble()

    println("O dobro de $number é ${number!! * 2}")
    println("A terça parte de $number é ${number / 3.0}")

}