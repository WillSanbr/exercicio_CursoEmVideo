package Vector

const val n = 15

fun main() {

    preenchendoVector()

}


private fun preenchendoVector() {
    var list = mutableSetOf<Int>() //lista do tipo set
    var mum10 = mutableListOf<Int>() //array
    var i = 1
    while (i <= n) {
        println("selecione numero $i: ")
        val numero = readln().toInt()
        list.add(numero)
        i++
    }
    for (i in list) {
        if (i % 10 == 0) {
            mum10.add(i)
        }
    }
    numeroTotal(listaNumSet = list)
    numeroMult10(listaNum = mum10)
}

private fun numeroMult10(listaNum: List<Int>) {
    print("Os numeros multiplos de 10: ")
    for (c in listaNum.indices) print("${listaNum[c]} ,")
    println()
}

private fun numeroTotal(listaNumSet: MutableSet<Int>) {
    print("todos os numeros listado: ")
    for (i in listaNumSet.iterator()) print("$i ,")
    println()
}

