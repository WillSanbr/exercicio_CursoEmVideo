package CodicaoBasica

const val longTrip = 0.45
const val trip = 0.50

fun main() {

     println("Digite a distancia que deseja percorrer (Km): ")
     val kmRun = readln().toInt()

    if(kmRun <= 200){
         val ticket  = kmRun + (kmRun * trip)
        println(String.format("O valor que vai pagar é R$%.2f",ticket))
    }else{
        val ticket  = kmRun + (kmRun * longTrip)
        println(String.format("O valor que vai pagar é R$%.2f",ticket))
    }









}