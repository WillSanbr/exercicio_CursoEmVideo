package Procedimentos


fun main() {

    println("Digite a mensagem deseja passar: ")
    val texto = readln()

    gerador(texto)

}

private fun gerador(msg: String) {
    println("+-------=======------+")
    println(" $msg".toUpperCase())
    println("+-------=======------+")
}