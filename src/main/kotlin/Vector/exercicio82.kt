package Vector


fun main() {

    notasDosAlunos()

}

private fun notasDosAlunos() {

    var maiorDig = 0.0f
    var listaMedia = mutableListOf<Float>()
    var listaNotas = mutableListOf<Float>()

    for (a in 1..10) {
        println("-------------------------")
        print("$a - aluno digite a nota 1: ")
        val nota1 = readln().toFloat()

        print("$a - aluno digite a nota 2: ")
        val nota2 = readln().toFloat()

        print("$a - aluno digite a nota 3: ")
        val nota3 = readln().toFloat()
        println("-------------------------")

        val media = (nota1 + nota2 + nota3) / 3.0f
        listaMedia.add(media)

        listaNotas.add(nota1)
        listaNotas.add(nota2)
        listaNotas.add(nota3)

    }
    maiorNota(listaNotas)
    val mediaTot = mediaTurma(listaMedia)
    maiorMediaAlun(listaMedia,mediaTot)
}

private fun maiorNota(list: List<Float>) {
    var maiorN = 0.0f

    for (l in list) {
        if (l >= maiorN) maiorN = l
    }
    println("A maior nota digitada foi $maiorN ")

    for (i in list.indices) {
        if (list[i] >= maiorN) println("posicao $i a maior nota digitada ${list[i]}")
    }
}

private fun mediaTurma(list: List<Float>): Float {
    var somaNotas = 0.0f
    for (n in list) somaNotas += n
    val media = somaNotas / 10.0f
    println(String.format("A media da turma foi %.1f ", media))
    return media
}

private fun maiorMediaAlun(lista: List<Float>, media: Float){
    var acimaMedia = 0
    for (m in lista){
        if(m >= media) acimaMedia++
    }
    println("Foram $acimaMedia alunos acima na media")
}






