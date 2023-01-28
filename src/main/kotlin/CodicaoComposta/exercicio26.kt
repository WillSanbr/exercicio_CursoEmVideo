package CodicaoComposta

fun main() {

    println("Digite o numero: ")
    val n1 = readln().toInt()

    println("Digite o numero: ")
    val n2 = readln().toInt()

    if (n1 > n2) {
        println("O primeiro valor é maior: $n1")
    } else if (n1 < n2) {
        println("O segundo valor é maior: $n2")
    } else {
        println("Nao existe valor maior, pois sao iguais: P= $n1 e S= $n2")
    }


}