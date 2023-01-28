package Procedimentos

fun main() {

    print("Primeiro numero: ")
    val numero1 = readln().toInt()

    print("Segundo numero: ")
    val numero2 = readln().toInt()

    Somar(numero1, numero2)
}

private fun Somar(n1: Int, n2: Int) = println(n1 + n2)