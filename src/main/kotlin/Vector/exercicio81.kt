package Vector

fun main() {

    leituraVectorIdade()

}


private fun leituraVectorIdade() {

    var listAge = mutableListOf<Int>()
    var cdasAge = 0

    for (cont in 1..8) {
        println("Digite idade: ")
        val age = readln().toInt()
        cdasAge++
        listAge.add(age)
    }
    mediaIdade(cdasAge, listAge)
    pessoas25anos(listAge)
    maiorIdade(listAge)
}

private fun mediaIdade(age: Int, listAge: List<Int>) {
    var totIdade = 0
    for (c in listAge) totIdade += c
    println("A media das idades foi entre ${totIdade / age} anos")
    println()
}

private fun pessoas25anos(listAgep: List<Int>) {
    println("Pessoas com mais 25 anos: ")
    println("--------------------------")
    for (ps in listAgep.indices) {
        if (listAgep[ps] > 25) {
            println("indice $ps e ${listAgep[ps]} anos")
        }
    }
    println()
}

private fun maiorIdade(listAgeMr: List<Int>){
    var maior = 0

    println("Maior idade")
    println("---------------------------")

    for (mrNumero in listAgeMr.indices){
           if(listAgeMr[mrNumero] >= maior){
               maior = listAgeMr[mrNumero]
           }
    }
    for (l in listAgeMr.indices){
        if(listAgeMr[l] >= maior){
            println("Maior idade indice $l e ${listAgeMr[l]} anos")
        }
    }
}


