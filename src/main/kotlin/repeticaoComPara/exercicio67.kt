package repeticaoComPara

fun main() {

    println("Digite um valor: ")
    val x = readln().toInt()

    contamgemNum(x)

}


private fun contamgemNum(numb: Int) {

    for (c in 0..numb) {
        print("$c ")
    }
    println("fim!!!".toUpperCase())

}





