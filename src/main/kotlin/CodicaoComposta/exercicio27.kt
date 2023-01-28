package CodicaoComposta

fun main() {

    println("Digite a sua Primeira Nota: ")
    val note1 = readln().toFloat()

    println("Digite a sua Segunda Nota: ")
    val note2 = readln().toFloat()

    val media = (note1 + note2) / 2.0f

    if(media <= 4.9){
        println(String.format("REPROVADO: %.1f nota",media))
    }else if((media >= 5.0) && (media <= 6.9)){
       println(String.format("Recuperação: %.1f",media))
    }else{
        println(String.format("Aprovado: %.2f",media))
    }
}