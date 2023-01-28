package CodicaoComposta

fun main() {

    println("Digite a sua altura: ")
    val height = readln().toFloat()

    println("Digite o seu peso: ")
    val weight = readln().toFloat()

    val validImc = Imc(height,weight)

    println("O seu indice corporal é $validImc")


}

fun Imc(al: Float, ps: Float): String{
    val imcResult = ps / (al * al)
    var msgImc = ""
     if(imcResult < 18.5){
          msgImc = "Abaixo do peso: "
     }else if(imcResult in 18.5 .. 24.9){
         msgImc = "Peso ideal "
     }else if(imcResult in 25.0 .. 29.9){
         msgImc = "Sobrepeso"
     }else if(imcResult in 30.0 .. 40.0){
         msgImc = "Obsidade"
     }else{
         msgImc = "Obsidade mórbida"
     }
    return msgImc
}