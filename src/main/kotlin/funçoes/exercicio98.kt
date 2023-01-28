package funçoes

fun main() {

    GrandeSoma(18, 25)


}

fun GrandeSoma(a: Int, b: Int) {

    var somar = 0
    var numeros = mutableListOf<Int>() //lista manipulavel (add/remove)

    //adiciona valor para lista
    for (i in a..b) {
        numeros.add(i)
    }

    print("vai soma ")

    for (n in numeros.indices) {
        somar += numeros[n] // somar = 0 + numero(lista)
        print("${numeros[n]} + ")
    }
    print("e vai retorna = $somar\n")
}








