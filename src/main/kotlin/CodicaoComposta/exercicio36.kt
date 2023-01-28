package CodicaoComposta

fun main() {

    println("Quantas horas de atividade fisica teve no mes? ")
    val horaFs = readln().toInt()

    ponAtividade(horaFs)
    ponAtividade(horaFs)
    ponAtividade(horaFs)
    ponAtividade(horaFs)
    ponAtividade(horaFs)

}

fun ponAtividade(sd: Int){
    if(sd < 10){
        val pont = sd * 2
        val result = (pont.toFloat()/100)
        val cent = (result * 100).toInt()
        println(String.format("O cliente faturou R$%.2f (%d pontos)",result,cent))
    }else if(sd in 10..19){
        val pont = sd * 5
        val result = (pont.toFloat()/100)
        val cent = (result * 100).toInt()
        println(String.format("O cliente faturou R$%.2f (%d pontos)",result,cent))
    }else{
        val pont = sd * 10
        val result = (pont.toFloat()/100)
        val cent = (result * 100).toInt()
        println(String.format("O cliente faturou R$%.2f (%d pontos)",result,cent))
    }
}