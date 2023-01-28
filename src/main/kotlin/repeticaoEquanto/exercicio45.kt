package repeticaoEquanto

fun main() {

    println("Digite o primeiro numero: ")
    val numberFirst = readln().toInt()

    println("Digite o ultimo numero: ")
    val numberEnd = readln().toInt()

    println("Imprimir em quantas vezes? ")
    val iterator = readln().toInt()

    correcaoContagem(numberFirst,numberEnd,iterator)
    correcaoContagem(numberFirst,numberEnd,iterator)
    correcaoContagem(numberFirst,numberEnd,iterator)
}

fun correcaoContagem(p1: Int, s2: Int, it: Int){
    var number = 0
    var finalNum = 0

    if(p1 >= s2){
          number = s2
          finalNum = p1
    }else{
         number = p1
         finalNum = s2
    }
       while (number <= finalNum){
            print("$number \t")
            number += it
       }
          print("Acabou!!!")
          println()
}