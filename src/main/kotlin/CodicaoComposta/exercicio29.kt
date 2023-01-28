package CodicaoComposta

const val AUM3 = 0.03f
const val AUM12 = 0.125f
const val AUM20 = 0.200f

fun main() {

    println("Qual nome do funcionario? ")
    val nameOffc = readln()

    println("Qual é seu salário? ")
    val salary = readln().toDouble()

    println("Quantos anos trabalha na Empresa? ")
    val yearsCom = readln().toInt()

   if(yearsCom <= 3){
       val totSalary = (salary * AUM3) + salary
       println(String.format
           ("O funcionario %s teve reajuste de %s atualizando para R$%.2f",
           nameOffc,"3%",totSalary))
   }else if((yearsCom > 3) && (yearsCom <= 10)){
       val totSalary = (salary * AUM12) + salary
       println(String.format
           ("O funcionario %s teve reajuste de %s atualizando para R$%.2f",
           nameOffc,"12,5%",totSalary))
   }else{
       val totSalary = (salary * AUM20) + salary
       println(String.format
           ("O funcionario %s teve reajuste de %s atualizando para R$%.2f",
           nameOffc,"20%",totSalary))
   }




}