package repeticaoEquanto

fun main() {
   conta100()
   conta100()
   conta100()
}

fun conta100(){
    var x = 100
    while (x >= 0){
        print("$x\t")
          x -= 5
    }
    print("Acabou!!!")
    println()
}

