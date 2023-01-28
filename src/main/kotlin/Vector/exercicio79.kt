package Vector

fun main() {
    var listaNumero = mutableListOf<Int>()

    var x = 1
    while (x <= 10) {
        print("$x numero: ")
        val numb = readln().toInt()
        listaNumero.add(numb)
         x++
    }
    numerosPares(listaNumero)
}

private fun numerosPares(list: List<Int>) {
    for (l in list.indices) {
        if (list[l] % 2 == 0) {
            println("posicao $l e valor PAR: ${list[l]}")
        }
    }
}
