package repeticaoEquanto

import funçoes.media

fun main() {

    leitorIdade()


}


fun leitorIdade() {
    var totalAge = 0
    var personAgeMr = 0
    var personAgeMn = 0

    var x = 1
    while (x <= 10) {
        println("Digite a $x idade: ")
        val age = readln().toInt()
        totalAge += age //total idade
        if (age >= 18) {
            personAgeMr++
        } else if(age <= 5) {
            personAgeMn++
        }
        x++
    }
    val mediaAge = (totalAge / 10)

    println("a media da idade das pessoas é $mediaAge")
    println("Pessoa maiores de 18 anos foram $personAgeMr pessoas")
    println("Pessoa menores de 5 anos foram $personAgeMn pessoas")
}