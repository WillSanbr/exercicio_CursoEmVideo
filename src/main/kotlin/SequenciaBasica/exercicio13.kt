package SequenciaBasica

const val INCREAS = 0.15

fun main(){

    println("Insira o seu Salario R$? ")
    val salary = readLine()?.replace(",",".")?.toDouble()

    val incSalary = salary!! * INCREAS //ex: 160 valor
    val updateSal = salary + incSalary // ex: 1200 + 160

    println(String.format("O salario do funciona: R$%.2f \n"
               + "Foi aumento para R$%.2f ",salary,updateSal))






}