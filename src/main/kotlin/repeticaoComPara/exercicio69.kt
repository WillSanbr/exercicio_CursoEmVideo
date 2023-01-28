package repeticaoComPara

fun main() {

    print("Primeiro termo: ")
    val prTermo = readln().toInt()

    print("Razao: ")
    val razao = readln().toInt()


    ProgressaoAritme(prTermo, razao)


}


private fun ProgressaoAritme(a1: Int, r: Int) {

    //Formula Programação aritmetica
    val an = a1 + (10 - 1) * r

    for (cont in a1..an step r) {
        print("$cont -> ")
    }
    println("Acabou!!!")
}
