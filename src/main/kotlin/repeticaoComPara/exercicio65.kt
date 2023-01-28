package repeticaoComPara

fun main() {

    descrencenteNum()
    descrencenteNum()
    descrencenteNum()
}


private fun descrencenteNum() {


    for (n in 100 downTo 0 step 10) {
        print("$n ")
    }
    println("Acabou!!!")

}