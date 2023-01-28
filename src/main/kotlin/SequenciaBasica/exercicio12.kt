package SequenciaBasica

const val DESC = 0.05

fun main() {

    println("Insira o preço do produto R$?")
    val produtcPrice = readLine()?.replace(",",".")?.toDouble()

    val producDif = produtcPrice!! * DESC
    val producTotally = produtcPrice - producDif


    println(String.format("O valor do produto é R$%.2f com Desconto fica R$%.2f",
        produtcPrice,producTotally))




}