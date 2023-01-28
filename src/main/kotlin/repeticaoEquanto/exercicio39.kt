package repeticaoEquanto

fun main() {
   decres()
   decres()
   decres()
}

fun decres(){
    var x = 11
    while (x >= 3){
        print("$x \t")
        x-- // decremetno dimin -> x = x - 1
    }
    print("Acabou!")
    println()
}