package Vector

import kotlin.random.Random

fun main() {

    var listaNumeros = mutableListOf<Int>()

    for (n in 0..20) {
        val sortNum = Random.nextInt(100)
        listaNumeros.add(sortNum)
    }
    listaDesorganizada(listaNumeros)
    listaOrganizada(listaNumeros)
}

private fun listaDesorganizada(lista: List<Int>) = print("$lista ")

private fun listaOrganizada(listaOrg: List<Int>) {
    println()
    var aux = 0
    val listaReordenando = listaOrg.toMutableList()

    for (i in listaReordenando.indices) {
        for (j in  listaReordenando.indices) {
            if (listaReordenando[i] < listaReordenando[j]) {
                aux = listaReordenando[i]
                listaReordenando[i] = listaReordenando[j]
                listaReordenando[j] = aux
            }
        }
    }
     for (i in listaReordenando) print("$i ")
}




