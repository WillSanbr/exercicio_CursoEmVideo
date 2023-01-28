package SequenciaBasica

fun main(){

  println("Digite um numero: ")
   val number = readLine()?.toInt()

    val predec = number!! - 1
    val sucs = number + 1

    println("O antecessor de $number é $predec")
    println("O sucessor de $number é $sucs")

}