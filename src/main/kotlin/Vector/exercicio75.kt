package Vector

const val termos = 14

fun main() {

listaFibunnat()
listaFibunnat()
listaFibunnat()
listaFibunnat()

}


private fun listaFibunnat() {

    var t1 = 0
    var t2 = 1
    var listNumber = mutableListOf<Int>()

    listNumber.add(t2)


    var x = 0
    while (x <= termos) {
        val t3 = t1 + t2
        listNumber.add(t3)
        t1 = t2
        t2 = t3
        x++
    }

    for (most in listNumber){
        print("$most ")
    }

    println("Acabou!!!")

}
