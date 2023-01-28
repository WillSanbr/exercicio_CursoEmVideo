package funçoes

fun main() {

    println("Digite um numero: ")
    val n1 = readln().toInt()

    println("Digite um numero: ")
    val n2 = readln().toInt()

    println("vai calcular potencia $n1 e expoente $n2 Resultado = " +
            "${pontenciacao(n1.toDouble(), n2.toDouble())}")


}

fun pontenciacao(x: Double, y: Double): Int {
    val pot = Math.pow(x,y)
    return pot.toInt()
}