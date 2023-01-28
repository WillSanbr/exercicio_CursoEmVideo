package SequenciaBasica

fun main() {

   println("Quantidade de cigarros fumado por dia? ")
   val qtdeCig = readLine()?.toInt()

    println("Quantos anos fumando? ")
    val yearsCigar = readLine()?.toInt()

//calculo de redução de tempo de VIda
val qtdeDay = yearsCigar!! * 365 //1 ano = 365 dias
val totCig = qtdeDay * qtdeCig!!

/*
#1 dia = 24 horas = 1440min = 86400 seg
#1 hora = 60 min = 3600seg
#1 min = 60 seg
 */

val minLose = totCig * 10
val dayLose = (minLose / 1440)


    println("Dias de vida perdido: $dayLose dias.")





}