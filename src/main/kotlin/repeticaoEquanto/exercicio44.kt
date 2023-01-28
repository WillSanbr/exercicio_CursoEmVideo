package repeticaoEquanto

fun main() {
    println("Digite o primeiro numero: ")
    val numberFirst = readln().toInt()

    println("Digite o ultimo numero: ")
    val numberEnd = readln().toInt()

    println("Imprimir em quantas vezes? ")
    val iterator = readln().toInt()

    valorContagem(numberFirst,numberEnd,iterator)
    valorContagem(numberFirst,numberEnd,iterator)
    valorContagem(numberFirst,numberEnd,iterator)
}

fun valorContagem(p1: Int, s2: Int, it: Int){
    var numbLoop = p1
    while (numbLoop <= s2){
        print("$numbLoop\t")
         numbLoop += it
    }
      print("Acabou!!!")
      println()
}
