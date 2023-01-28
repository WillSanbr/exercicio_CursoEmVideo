package Procedimentos

fun main() {

    println("Digite a mensagem deseja passar: ")
    val texto = readln()

    println("Quantas vezes deseja exibir? ")
    val vz = readln().toInt()

    gerador(texto,vz)
}


private fun gerador(msg: String, n: Int) {
    println("+-------=======------+")
    for (i in 1..n) {
        println(msg.toUpperCase())
    }
    println("+-------=======------+")
}


