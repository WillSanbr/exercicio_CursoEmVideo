package Vector

import kotlin.random.Random

fun main() {

    var lista = mutableListOf<Int>()

    var i = 1
    while (i <= 7) {
        val sortCompt = Random.nextInt(8)
        lista.add(sortCompt)
        i++
    }
    numerosSortead(listNum = lista)
}

private fun numerosSortead(listNum: List<Int>){
    for (i in listNum.indices) print("${listNum[i]} ")
}