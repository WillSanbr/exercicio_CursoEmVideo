package Vector

import kotlin.random.Random

fun main() {

    /*

    orderna a lista de forma crescente

    val aa = arrayOf(1,5,81,71,72)

    aa.sort()

    println("o valor é ${aa.joinToString()} ")


     */

    var listNumb = mutableListOf<Int>()
    for (i in 0..20) {
        val sortNumber = Random.nextInt(100)
        listNumb.add(sortNumber)
    }
    listaDesorganizada(listNumb)
    listaOrganizada(listNumb)
}

private fun listaDesorganizada(lista: List<Int>) = println(lista.toString())

private fun listaOrganizada(lista: List<Int>) {
    val listOrg = lista.toMutableList() //Mutavel convertendo para Mutuvalvel
    listOrg.sort() //organiza
    println(listOrg)
}