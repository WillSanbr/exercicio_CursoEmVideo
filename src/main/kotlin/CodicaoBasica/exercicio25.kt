package CodicaoBasica

fun main() {

    println("Digite o primeiro lado do triangulo: ")
    val r1 = readln().toInt()

    println("Digite o segundo lado do triangulo: ")
    val r2 = readln().toInt()

    println("Digite o terceiro lado do triangulo: ")
    val r3 = readln().toInt()

    val t1 = r3 + r2
    val t2 = r1 + r3
    val t3 = r2 + r3

    if((r3 < t1) && (r2 < t2) && (r1 < t1)){
        println("E considerado um triangulo")
    }else{
        println("nao e considerado um triangulo")
    }
}