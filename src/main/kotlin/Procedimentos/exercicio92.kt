package Procedimentos

fun main() {

    print("Numero: ")
    val numero = readln().toInt()

    ParouImpar(numero)
}

private fun ParouImpar(numero: Int){
    if(numero % 2 == 0) println("O numero $numero é Par ")
    else println("O numero $numero é Impar ")
}