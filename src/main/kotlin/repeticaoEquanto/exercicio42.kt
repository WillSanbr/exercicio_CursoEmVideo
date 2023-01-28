package repeticaoEquanto

fun main() {

   println("Digite um numero: ")
   val numero = readln().toInt()

   contagemG(numero)
   contagemG(numero)
   contagemG(numero)

}

fun contagemG(nm: Int){
    var x = 1

    while (x <= nm){
        print("$x \t")
        x++
    }
     print("acabou!!!")
     println()
}

