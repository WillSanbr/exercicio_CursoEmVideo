package Vector

fun main() {

    preenche999()


}



private fun preenche999(){

    var number999 = mutableListOf<Int>()

    for (c in 0..7){
        number999.add(999)
    }

    for (l in number999){
        print("$l ")
    }
println("Acabou!!!")
}