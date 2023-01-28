package funçoes

fun main() {

    println("Digite 1 numero: ")
    val a = readln().toInt()

    println("Digite 2 numero: ")
    val b = readln().toInt()

    println("Digite 3 numero: ")
    val c = readln().toInt()

    val msg = verificandoMaior(a,b,c)

    println(msg)

}

fun verificandoMaior(n1: Int, n2: Int, n3: Int): String{

    var text: String? = ""

    if((n1 > n2) && (n1 > n3)){
       text = "O numero maior é $n1"
    }else if((n2 > n1) && (n2 > n3)){
        text = "O numero maior é $n2"
    }else if((n3 > n1) && (n3 > n2)){
        text = "O numero maior é $n3"
    }else{
        text = "O numero $n1 e $n2 e $n3"
    }
   return text
}



