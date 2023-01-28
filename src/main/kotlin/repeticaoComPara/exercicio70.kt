package repeticaoComPara

fun main() {

    println("Quantos termos voce deseja mostrar tela? ")
    val fibunt = readln().toInt()

    fibonacci(fibunt)


}


private fun fibonacci(n: Int) {

    var t1 = 0
    var t2 = 1
    var t3: Int? = 0

    print("$t2 -> ")
    var cont = 3
    while (cont <= n) {
        t3 = t1 + t2
        print("$t3 -> ")
        t1 = t2
        t2 = t3
        cont++
    }
    print("Acabou!!!")


}