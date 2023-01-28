package CodicaoComposta

import kotlin.random.Random

/**
 * @author Willian Caldas
 *
 *
 *
 */

fun main() {

    val gameJoke = arrayOf("Pedra", "Papel", "Tesoura")
    val genMachine = numberMaschine() //função gera numero
    val choiceMachine = gameJoke[genMachine] //escolha da maquina

    //terminal
    val msgGame = """ 
        "==================================================="
        "           BEM VINDO GAME JOKEN PO!!!              "
        "                seleciona:                         "
        "                0 = Pedra                          "
        "                1 = Papel                          "
        "                2 = Tesoura                        "
        "==================================================="
    """

    print(msgGame)
    val choisePl = readln().toInt()

    //Expressao tem (Victoria/Derrota/Empate) => acessa lista GameJOke
    when (choisePl) {
        0 -> {
            if ((gameJoke[0] == "Pedra") && (choiceMachine == "Pedra")) {
                print("Empatou!!!")
            } else if ((gameJoke[0] == "Pedra") && (choiceMachine == "Papel")) {
                print("Perdeu!!! Tente novamente")
            } else if ((gameJoke[0] == "Pedra") && (choiceMachine == "Tesoura")) {
                print("Parabens voce ganhou!!!")
            }
        }
        1 -> {
            if ((gameJoke[1] == "Papel") && (choiceMachine == "Papel")) {
                print("Empatou!!!")
            } else if ((gameJoke[1] == "Papel") && (choiceMachine == "Tesoura")) {
                print("Perdeu!!! Tente novamente")
            } else if ((gameJoke[1] == "Papel") && (choiceMachine == "Pedra")) {
                print("Parabens voce ganhou!!!")
            }
        }
        2 -> {
            if ((gameJoke[2] == "Tesoura") && (choiceMachine == "tesoura")) {
                print("Empatou!!!")
            } else if ((gameJoke[2] == "Tesoura") && (choiceMachine == "Pedra")) {
                print("Perdeu!!! Tente novamente")
            } else if ((gameJoke[2] == "Tesoura") && (choiceMachine == "Papel")) {
                print("Parabens voce ganhou!!!")
            }
        }
        else -> {
            print("Erro dx4324234")
        }

    }

}

fun numberMaschine(): Int {
    val sortMachine = Random.nextInt(3)
    return sortMachine
}