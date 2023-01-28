package SequenciaBasica

fun main() {

    println("O ano para analizar se e bissexto: ")
    val years = readln().toInt()


    if((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0)){
        println("Ano Bissexto")
    }else{
        println("Ano nao e Bissexto $years")
    }












}