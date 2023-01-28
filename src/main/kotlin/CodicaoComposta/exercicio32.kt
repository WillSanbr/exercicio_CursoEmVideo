package CodicaoComposta

import kotlin.random.Random

fun main() {

    val numberMachine = sortNumber()

    println("Escolhe um numero de 1 a 5: ")
    val choicePl = readln().toInt()

    if (choicePl == numberMachine){
        println("Voce advinhou numero certo")
    }else{
        println("Voce errou, tente novamente!!!")
    }
}

//Função de sorteio para Maquina escolhe (RETORNA INT)
fun sortNumber(): Int {
    val random = Random
    var sort: Int = random.nextInt(6)
    if (sort == 0) sort = 1
    return sort
}


