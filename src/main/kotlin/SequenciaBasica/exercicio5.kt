package SequenciaBasica

fun main(){

    println("Qual foi a sua primeira Nota?")
    val note1 = readLine()?.toDouble()

    println("Qual foi a sua segunda Nota?")
    val note2 = readLine()?.toDouble()

   if(note1!! > note2!!){
        var result = (note1 + note2)/2.0
       println("A media entre $note1 e $note2 é igual a $result")
   }else if(note1 < note2){
       var result = (note2 + note1)/2.0
       println("A media entre $note1 e $note2 é igual a $result")
   }else{
        var result = (note1 + note2)/2.0
       println("A media entre $note1 e $note2 é igual a $result")
   }



}