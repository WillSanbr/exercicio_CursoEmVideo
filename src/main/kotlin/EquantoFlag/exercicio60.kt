package EquantoFlag

fun main() {

    exibrInformacao()

}

fun exibrInformacao() {

    var contagem = 0
    var numPes = 0
    var maiorAge = 0
    var pessoVelh = ""
    var hom30anos = 0
    var totage = 0
    var totMul18 = 0
    var joungMul = ""
    var menorIdade = 1000

    while (contagem < 1) {
        numPes++
        println("Digite o nome da $numPes pessoa: ")
        val nomePs = readln()

        println(
            "=====================\n" +
                    " seleciona o sexo da $numPes pessoa: \n" +
                    "digite m: masculino\n" +
                    "digite f: feminino\n" +
                    "====================="
        )
        val genro = readln()[0]

        println("Qual idade da $numPes pessoa? ")
        val agePs = readln().toInt()

        if (agePs >= maiorAge) {
            maiorAge = agePs
            pessoVelh = pessoaVelha(nomePs)
        }
        totage += agePs

        when (genro) {
            'm' -> if (agePs >= 30) hom30anos++
            'f' -> {
                if (agePs <= menorIdade) {
                    menorIdade = agePs
                    joungMul = mulherMaisJov(nomeP = nomePs)
                }
                if (agePs < 18) totMul18++
            }
            else -> {
                println("Erro dxasdasd nao preencheu o campo sexo!!!!")
                System.exit(0)
            }
        }
        println(
            "==================\n" +
                    "Deseja continuar? \n" +
                    "Sim: y Nao: n\n" +
                    "=================="
        )
        val esc = readln()[0]

        if ((esc == 'y') || (esc == 'Y')) {

        } else if ((esc == 'n') || (esc == 'N')) {
            println("resultado!!!".toUpperCase())
            contagem += 2
        }
    }
    println(pessoVelh)
    println(joungMul) //mulher mais jovem
    println("A media de idade do grupo foi ${totage / numPes} anos")
    println("Homem mais de 30 anos foi $hom30anos pessoas")
    println("Mulheres menos de 18 anos foi $totMul18 pessoas")
}
fun pessoaVelha(nomeP: String): String = "A pessoa com a maior idade foi o(a) $nomeP"
fun mulherMaisJov(nomeP: String): String = "A mulher mais jovem foi mulher $nomeP"


