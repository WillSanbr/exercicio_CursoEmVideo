package Procedimentos

fun main() {

    fibonati(9)



}


private fun fibonati(termos: Int) {
    var t1 = 0
    var t2 = 1
    var result = 0

    print("$t2 >> ")

    for (c in 0..termos) {
        result = t1 + t2
        print("$result >> ")
        t1 = t2
        t2 = result
    }
    println("Fim".toUpperCase())
}