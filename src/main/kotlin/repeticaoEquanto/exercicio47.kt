package repeticaoEquanto

fun main(){
    somaNumeros()
    somaNumeros()
    somaNumeros()
    somaNumeros()
}

fun somaNumeros(){
    var x = 500
    var total = 0
    while (x >= 0){
       print("+ $x ")
       total += x
        x -= 50 //decremento
    }
    print("= Total da soma é $total")
    println()
}



