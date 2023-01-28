package Vector

fun main() {

    adicionar5_3()
    adicionar5_3()
    adicionar5_3()


}

private fun adicionar5_3(){

    var numeros = mutableListOf<Int>()
    val n1 = 5
    val n2 = 3

    for (n in 0..4){
        numeros.add(n1)
        numeros.add(n2)
    }

    for (i in numeros.indices){
        print("${numeros[i]} ")
    }
     println()
}


