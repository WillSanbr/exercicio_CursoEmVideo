package SequenciaBasica

fun main(){

println("Qual é seu nome? ")
val nameOffic = readLine().toString()

  println("Digite o seu salario: ")
    val salary = readLine()?.replace(",",".")?.toDouble()

println(String.format("Nome do funcionario: %s\n"
         + "Salario: R$ %.2f\n"
        + "O funcionario %s tem um salario de R$%.2f em julho",
             nameOffic,salary,nameOffic,salary))




}