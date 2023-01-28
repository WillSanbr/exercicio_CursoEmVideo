package repeticaoEquanto

fun main(){

    leitorNumber()

}

private fun leitorNumber(){
    var x = 1
    var total = 0
     while (x <= 7){
         println("Digite $x numero: ")
         val number = readln().toInt()
         total += number
         x++
     }
       println("O Resultado é $total")
}