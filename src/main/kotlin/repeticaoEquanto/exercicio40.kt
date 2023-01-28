package repeticaoEquanto

fun main() {
    contam3()
    contam3()
    contam3()
}

fun contam3(){
    var x = 0

    while (x <= 18){
        print("$x \t")
        x += 3
    }
    print("Acabou!!!")
    println()
}