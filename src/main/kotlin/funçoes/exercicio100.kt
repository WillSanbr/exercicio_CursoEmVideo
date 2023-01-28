package funçoes

fun main() {

    println("Digite primeira nota: ")
    val note1 = readln().toFloat()

    println("Digite segundo nota: ")
    val note2 = readln().toFloat()

    val result = mediaAlun(note1, note2)

    situacao(result)
}

fun mediaAlun(n1: Float, n2: Float): Float { return (n1 + n2) / 2.0f }

fun situacao(mediaN: Float) {

    if (mediaN >= 7.0) {
        println("Aluno aprovado")
    } else if (mediaN in 5.0..6.9) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}



