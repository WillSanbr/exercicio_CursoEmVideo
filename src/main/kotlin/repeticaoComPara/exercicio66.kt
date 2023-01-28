package repeticaoComPara

fun main() {

    println("Escolhe um numero para descobrir tabuada: ")
    val nTabuad = readln().toInt()

    tabuada(nTabuad)


}


private fun tabuada(numberTb: Int) {
    for (t in 1..10) {
        println("$numberTb X $t = ${numberTb * t}")
    }
}


