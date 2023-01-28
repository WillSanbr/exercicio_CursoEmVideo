package Vector

fun main() {

preenchendo5nume()

}


private fun preenchendo5nume() {

    var listNumber = mutableListOf<Int>()
    for (i in 0..50 step 5) {
        listNumber.add(i)
    }

    for (lNum in listNumber) {
        print("$lNum ")
    }

    print("Acabou!!! ")

}



