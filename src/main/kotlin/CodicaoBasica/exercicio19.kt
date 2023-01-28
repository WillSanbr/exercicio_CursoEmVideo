package CodicaoBasica

fun main() {

    println("Digite a primeira nota:")
    val note1 = readLine()?.toDouble()

    println("Digite a segunda nota: ")
    val note2 = readLine()?.toDouble()

    val media = (note1!!+note2!!) / 2.0

if(media >= 7.0){
    println("teve um bom aproveitamento!!!")
}else{
    println("Não teve um bom aproveitamento '<' ")
}



}