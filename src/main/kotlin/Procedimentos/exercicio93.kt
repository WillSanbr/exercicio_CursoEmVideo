package Procedimentos

fun main() {

    print("inicio da contagem: ")
    val iniNumber = readln().toInt()

    print("fim contagem: ")
    val fimNumber = readln().toInt()

    print("incremento: ")
    val incremTo = readln().toInt()

    contagem(iniNumber, fimNumber, incremTo)

}

private fun contagem(inic: Int, fimN: Int, increemen: Int) {
    var inicio = 0
    var fim = 0

    if (inic > fimN) {
        inicio = fimN
        fim = inic
    } else {
        inicio = inic
        fim = fimN
    }
    for (c in inicio..fim step increemen) {
        print("$c ")
    }
}



