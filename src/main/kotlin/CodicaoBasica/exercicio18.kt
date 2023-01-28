package CodicaoBasica

fun main() {

    println("Digite  a sua idade: ")
    val age = readLine()?.toInt()

   if(age!! >= 18){
       println("Pode votar!!!")
   }else{
      println("Nao pode votar devido ser Menor de idade")
   }




}