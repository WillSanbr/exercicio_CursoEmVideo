package Vector

fun main() {


    preenchimentoDesc()

}


private fun preenchimentoDesc() {

    var listNumber = mutableListOf<Int>()

    for (n in 9 downTo 0) {
        listNumber.add(n)
    }

    for (i in listNumber) {
        print("${listNumber[i]} ")
    }
    println("Acabou!!!")
}



