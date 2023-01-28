package repeticaoEquanto

fun main() {
    contagem()
    contagem()
    contagem()
}

fun contagem(){
    var x = 6
    while (x <= 11){
        print("$x \t")
          x++
    }
     print("Acabou!")
     println()
}