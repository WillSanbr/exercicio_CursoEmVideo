package SequenciaBasica

fun main() {

    print("Digite o LARGURA da sua parede(cm): ")
    val base = readln().toInt()

    print("Digite o ALTURA da sua parede(cm): ")
    val height = readln().toInt()

    val area: Int = base * height
    val listerPaint = area / 2

    println("Area da parede é $area m\n"
         + "Quantidade de tinta a ser " +
            "gasto é $listerPaint litros de tintas")

}