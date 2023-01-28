package funçoes

/**
 * @author: Willian Caldas
 *
 * multi funçoes
 */


fun main() {

    println("Digite o primeiro numero: ")
    val number1 = readLine()?.toInt()

    println("Digite o segundo numero: ")
    val number2 = readLine()?.toInt()

    val Sm = Somador(number1!!,number2!!)
  //  val Dim = Diminuir(number1,number2)
  //  val Mul = Multiplicar(number1,number2)
  //  val Div = Dividir(number1.toFloat(),number2.toFloat())

    println("A soma é $Sm")
   /* println("A diminuir é $Dim")
    println("A Multiplicação é $Mul")
    println("A Divisao é $Div")
   */
}

fun Somador(n1: Int, n2: Int): Int {return n1 + n2}

/*
fun Diminuir(n1: Int, n2: Int): Int {return n1 - n2}
fun Multiplicar(n1: Int, n2: Int): Int {return n1 * n2}
fun Dividir(n1: Float, n2: Float): Float {return n1 + n2}

*/
