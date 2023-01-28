package Vector

fun main() {

    idadeMenores()

}


private fun idadeMenores() {

    var listaNomes = mutableListOf<String>()
    var listaIdades = mutableListOf<Int>()

    var x = 1
    while (x <= 9) {
        print("Nome: ")
        val nome = readln()
        listaNomes.add(nome)

        print("idade: ")
        val age = readln().toInt()
        listaIdades.add(age)
        println()
        x++
    }
    for (i in listaIdades.indices){
        if(listaIdades[i] < 18){
            println("Foi listado ${listaNomes[i]} como menor de idade ")
        }
    }
}