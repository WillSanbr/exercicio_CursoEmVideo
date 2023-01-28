package Procedimentos

fun main() {

    gerador("Bom dia",3,2)
    gerador("Mae",5,1)
}

private fun gerador(msg: String, vezes: Int, borda: Int) {

    var bordaTxt = ""

    when (borda) {
        1 -> bordaTxt = "+-------=======------+"
        2 -> bordaTxt = "~~~~~~~~:::::::~~~~~~~"
        3 -> bordaTxt = "<<<<<<<<------->>>>>>>"
    }
    println(bordaTxt)
    for (i in 1..vezes) {
        println(msg)
    }
    println(bordaTxt)
}