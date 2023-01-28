package repeticaoEquanto

fun main() {

     precoProdMaioMen()



}


fun precoProdMaioMen(){

   var contador = 1
   var maior: Double = 0.0
   var menor: Double = 99999.9

   while (contador <= 8){

       println("Digite o $contador valor do produto: ")
       val priceNum = readln().toDouble()

       if(priceNum > maior){
            maior = priceNum
       }

       if(priceNum < menor){
           menor = priceNum
       }
       contador++
   }
    println("O maior preço é $maior")
    println("O menor preço é $menor")
}


