package repeticaoEquanto

fun main() {
    cadastroProduto()


}


fun cadastroProduto() {
    var listProdutc = mutableMapOf<String, Float>()
    var cont = 1
    var maior = 0.0f
    var menor = 100000f

    while (cont <= 3) {
        println("==================================================")
        println("Nome do $cont produto: ")
        val nomePric = readln()

        println("Valor do preco do $cont produto: ")
        val produtcPric = readln().toFloat()
        println("==================================================")

        listProdutc[nomePric] = produtcPric
        cont++

        if (produtcPric > maior) {
            maior = produtcPric
        }

        if (produtcPric < menor) {
            menor = produtcPric
        }
    }
    val priceMaior = listProdutc.filterValues { it >= maior }
    val priceMenor = listProdutc.filterValues { it <= menor }

    println(
        "O maior preço do produto: $priceMaior ".replace("{", "").replace("}", "")
    )
    println(
        "O menor preço do produto: $priceMenor".replace("{", "").replace("}", "")
    )
}



