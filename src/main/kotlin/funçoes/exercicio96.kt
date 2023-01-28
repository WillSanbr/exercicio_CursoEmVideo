package funçoes

fun main() {

    println("Digite primeira nota: ")
    val note1 = readln().toFloat()

    println("Digite segundo nota: ")
    val note2 = readln().toFloat()

    val result = media(note1,note2)

    println("A nota do aluno é $result")

}


fun media(n1: Float, n2: Float): Float{
   val calcMed = (n1 + n2) /2.0f
    return calcMed
}