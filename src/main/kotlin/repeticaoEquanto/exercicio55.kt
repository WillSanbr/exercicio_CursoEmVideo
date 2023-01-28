package repeticaoEquanto

import kotlin.random.Random

fun main() {

      tentativas4()




}


fun tentativas4(){
    val sortNumber = Random.nextInt(11)
    var infoFinal = 0
    var x = 1
    while (x <= 4){
        println("Advinha o numero que computador sorteou: ")
        val playerNumb = readln().toInt()

        if(playerNumb == sortNumber){
            println("Voce acertou o numero advinhado!!!!")
            infoFinal = playerNumb
            x += 5
        }else{
            println("Tente mais ${4 - x} tentativas")
            x++
        }
    }
    if(infoFinal == sortNumber){
        println("Finalizando programa!!!")
    }else{
        println("Game over!!!")
    }
}



