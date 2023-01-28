package EquantoFlag

fun main() {

    somaTotal()


}


fun somaTotal() {
    var x = 0
    var valorTotal = 0

    while (x != 1111) {
        println("Digite um numero: ")
        val numb = readln().toInt()
        if(numb == 1111) x = numb else valorTotal += numb
    }
    println("A soma é $valorTotal")
}






