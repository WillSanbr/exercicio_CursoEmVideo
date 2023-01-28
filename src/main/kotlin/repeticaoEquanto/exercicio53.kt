package repeticaoEquanto

fun main() {

    leitorSexoIdade()


}

fun leitorSexoIdade() {
    var totalGrAge = 0
    var totHomage = 0
    var totMul20age = 0
    var cadastHom = 0
    var cadastMul = 0

    var cont = 1
    while (cont <= 5) {
        println(
            "===================\n" +
                    "seleciona o $cont sexo:\n" +
                    "digite m: Masculino\n" +
                    "digite f: Feminino\n" +
                    "==================="
        )
        val sexo = readln()[0]

        println("Digite a $cont idade")
        val age = readln().toInt()

        totalGrAge += age // total todas as idades

        when (sexo) {
            'm' -> {
                totHomage += age // total idades de homes
                cadastHom++
            }
            'f' -> {
                if (age >= 20) {
                    totMul20age++
                }
                cadastMul++
            }
            else -> {
                println("Preenchimento errado!!!")
                System.exit(0)
            }
        }
        cont++
    }
    val mediaGroup = (totalGrAge / 5)
    val mediahom = (totHomage / cadastHom)

    println("Foram cadastrado $cadastHom homens")
    println("Foram cadastrado $cadastMul mulheres")
    println("A media de idade do Grupo foi $mediaGroup anos")
    println("A media de idade dos Homens foi $mediahom anos")
    println("As mulheres com mais de 20 anos foi $totMul20age")
}