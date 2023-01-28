package repeticaoEquanto

import funçoes.media

fun main() {

    leitorAlturaPs()

}


fun leitorAlturaPs() {
    var peso90 = 0
    var peso50160 = 0
    var peso100190 = 0
    var totAlt = 0.0f

    var cont = 1
    while (cont <= 5) {
        println("Digite a sua altura: ")
        val height = readln().toFloat()

        println("Digite o seu peso (kg): ")
        val width = readln().toInt()

        totAlt += height

        if ((height >= 1.90) && (width >= 100)) {
            peso100190++
        } else if ((width <= 50) && (height <= 1.60)) {
            peso50160++
        }
        if (width >= 90) peso90++
        cont++
    }
    println(String.format("A media da altura foi %.2fm", totAlt/5.0f))
    println("Pessoas pesam mais de 90kg foi $peso90 pessoas")
    println("Pessoas pesam menos de 50kg tem altura 1.60m foi $peso50160 pessoas")
    println("Pessoas pesam mais de 100kg tem altura 1.90m foi $peso100190 pessoas")
}

