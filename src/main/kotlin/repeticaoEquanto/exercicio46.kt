package repeticaoEquanto

fun main(){

    contagemSomar()

}


fun contagemSomar(){
    var x = 6
    var total = 0
    while (x <= 100){
        print("$x\t")
        total += x
        x += 2
    }
    println("")
    println("A soma entre 6 a 100: $total")
    println()
}





