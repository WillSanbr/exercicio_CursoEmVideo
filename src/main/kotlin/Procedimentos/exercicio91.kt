package Procedimentos

fun main() {

    print("Primeiro valor: ")
    val n1 = readln().toInt()

    print("Segundo valor: ")
    val n2 = readln().toInt()

    oMaior(n1,n2)

}

private fun oMaior(number1: Int, number2: Int){
   if(number1 > number2){
       println("O maior é $number1 ")
   }else if(number1 == number2){
       println("Os valores sao iguais ")
   }else{
       println("O maior é $number2 ")
   }
}




