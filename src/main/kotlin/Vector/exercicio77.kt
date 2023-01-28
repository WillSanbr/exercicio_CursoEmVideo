package Vector

fun main() {

    var listaNome = mutableListOf<String>()

    var x = 1
    while (x <= 7) {
        println("Digite o nome da pessoa: ")
        val nome = readln()
        listaNome.add(nome)
        x++
    }
    exibirNome(listaNome)
}

private fun exibirNome(listaNomes: List<String>) {
    print("Os nomes das pessoas foram: ")
    for (i in listaNomes.indices) print("${listaNomes[i]}, ")
}