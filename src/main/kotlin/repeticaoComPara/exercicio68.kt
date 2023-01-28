package repeticaoComPara

import kotlin.system.exitProcess

fun main() {

    sexoIdadeA()

}


private fun sexoIdadeA() {
    var pesoTotMul = 0
    var cadastroMul = 0
    var maiorPesoHom = 0
    var qtdepeso100H = 0

    for (i in 1..8) {
        println("Digite o seu peso $i: ")
        val peso = readln().toInt()

        println(
            "Digite o seu sexo $i: \n" +
                    "digite m: masculino\n" +
                    "digite f: feminino"
        )

        when (readln()[0]) {
            'm' -> {
                if (peso >= 100) qtdepeso100H++
                if (peso >= maiorPesoHom) maiorPesoHom = peso
            }
            'f' -> {
                pesoTotMul += peso
                cadastroMul++
            }
            else -> exitProcess(0)
        }

    }

    println("Foram cadastrado $cadastroMul mulheres")
    println("Homens pesam mais de 100 kg foram $qtdepeso100H pessoas")
    println("O peso medio das mulheres entre foram ${pesoTotMul / cadastroMul} kg")
    println("O maior peso entre o homem foi $maiorPesoHom kg")

}