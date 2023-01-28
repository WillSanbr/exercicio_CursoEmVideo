package SequenciaBasica

const val TAB = '\t'

fun main() {

    println("Digite uma distancia em metros: ")
    val meters = readLine()?.replace(",",".")?.toDouble()


    val msg = "A distancia de ${meters!! - 100} corresponde a:\n"+
              "================================================\n"+
              "${meters /1000}Km $TAB $TAB ${meters * 10}dm\n" +
              "${meters /100}Hm $TAB $TAB ${meters * 100}cm\n" +
              "${meters /10}Dam $TAB $TAB ${meters * 1000}mm\n"+
              "================================================"

    println(msg)



}