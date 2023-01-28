package CodicaoBasica

const val descM = 0.05
const val descW = 0.13

fun main() {

    var priceFinal: Double? = 0.0

    println("Digite o seu Nome:")
    val name = readln()

    println("Digite o seu sexo:  \n" +
            "m: masculino\n" +
            "f: feminino")
    val sexo = readln()

    println("Digite o valor das compras: ")
    val price = readLine()?.toDouble()

    if(sexo == "M" || sexo == "m"){
       priceFinal = price!! - (price * descM)
        println(String.format("O desconto do %s é R$%.2f",name,priceFinal))
    }else if (sexo == "F" || sexo == "f"){
        priceFinal = price!! - (price * descW)
        println(String.format("O desconto da %s é R$%.2f",name,priceFinal))
    }








}