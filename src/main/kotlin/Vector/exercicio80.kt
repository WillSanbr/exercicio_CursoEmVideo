package Vector

import kotlin.random.Random

fun main() {

    var listNumb = mutableListOf<Int>()

    for (i in 1..101) {
        val sortNumber = Random.nextInt(16)
        listNumb.add(sortNumber)
    }
    pesquisarChave(listNumb)
}

private fun pesquisarChave(lista: List<Int>) {
    println("Chave numero: ")
    val chv = readln().toInt()

    println("A chave $chv sorteado foi ${lista[chv]} numero")

    var repeticoes = 0
    for (vz in lista.indices) {
        if (lista[vz] == lista[chv]) {
            repeticoes++
        }
    }

    print("Foi sorteado $repeticoes vezes: ")

    for (i in lista.indices) {
        if (lista[i] == lista[chv]) {
            print("${lista[i]} ")
        }
    }
}



