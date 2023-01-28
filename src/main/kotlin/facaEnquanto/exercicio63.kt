package facaEnquanto

fun main() {

    somatorio()


}


private fun somatorio() {

    var menorNum = 999999
    var numDigit = 0
    var totNumber = 0
    var qtdePares = 0

    var i = 0
    do {
        println("Digite um numero: ")
        val number = readln().toInt()

        numDigit++ //quantidade de numers digitados
        totNumber += number //soma de todos os valores

        if (number <= menorNum) menorNum = number
        if (number % 2 == 0) qtdePares++

        println(
            "=================\n" +
                    "Digite c: continuar\n" +
                    "Digite p: parar\n" +
                    "================="
        )

        when (readln()[0]) {
            'c' -> println()
            'p' -> i++
            else -> println()
        }
    } while (i < 1)

    println("A soma de todos valores foi o resultado $totNumber")
    println("O menor numero digitado foi $menorNum")
    println("A media de todos os valores foi ${totNumber / numDigit}")
    println("Teve $qtdePares numeros pares")

}