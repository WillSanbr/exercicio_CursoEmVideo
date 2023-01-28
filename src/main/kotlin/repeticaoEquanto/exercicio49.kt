package repeticaoEquanto

fun main() {

    leitorNumImp_Pares()


}

private fun leitorNumImp_Pares() {
    var number = 0
    var listImpar = mutableListOf<Int>()
    var listPar = mutableListOf<Int>()
    var x = 1

    while (x <= 6) {
        println("Digite $x numero: ")
        number = readln().toInt()
        if (number % 2 == 0) {
            listPar.add(number)
        } else {
            listImpar.add(number)
        }
        x++
    }
    print("O numero par: ")
    var c1 = 0
    while (c1 in listPar.indices) {
        print("${listPar[c1]}, ")
        c1++
    }
    println()
    print("O numero Impar: ")

    c1 = 0
    while (c1 in listImpar.indices) {
        print("${listImpar[c1]}, ")
        c1++
    }
}





