package repeticaoEquanto

import kotlin.random.Random

fun main() {
    contagemNum()
    contagemNum()
    contagemNum()
    contagemNum()
}

private fun contagemNum() {
    var x = 0
    var listNumb = mutableListOf<Int>()
    var number = 0

    while (x <= 20) {
        val sortNumber = Random.nextInt(11)
        listNumb.add(sortNumber)
        x++
    }
    fun numeroEscolhidos() {
        print("Os numeros sorteado: ")
        var i = 0
        while (i < listNumb.size){
            print("${listNumb[i]} ")
            i++
        }
         println()
    }
    //Funcao Filter = pesquisa lista -> listNumb(Mutable)
    val filterNumb5 = listNumb.filter { x -> x > 5 }
    val filterNumb3 = listNumb.filter { x -> x % 3 == 0 }

    numeroEscolhidos()
    println("O maiores que 5: $filterNumb5")
    println("O numeros divisil por 3: $filterNumb3")
    println()
}







