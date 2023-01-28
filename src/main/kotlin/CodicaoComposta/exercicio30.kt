package CodicaoComposta

/**
 *
 * @author: Willian Caldas
 *
 *  DESAFIO: TRIANGULO = EQUILATERO,ISOLOCELES,ESCALENO
 *
 *
 */

fun main() {

    println("Digite o 1 lado do triangulo: ")
    val r1 = readln().toInt()

    println("Digite o 2 lado do triangulo: ")
    val r2 = readln().toInt()

    println("Digite o 3 lado do triangulo: ")
    val r3 = readln().toInt()

    //soma os dois lados
    val t1 = r3 + r2 // lado1S = 3l + 2l
    val t2 = r1 + r3 // lado2S = 1l + 3l
    val t3 = r2 + r3 // lado3S = 2l + 3l

    /*
        EXPRESSAO VERIFICA SE O TRIANGULO E CONSIDERADO TRIANGULO
           SE A SOMA Dois FOR MAIOR DA VERDADEIRO
     */

    if ((r1 <= t3) && (r2 <= t2) && (r3 <= t1)) {
        println("Pelas medidas é considerado triangulo!!!")
        if ((r1 == r2)  && (r3 == r1)) {
            println("Triangulo Equilatero!!!")
        } else if ((r1 != r2) && (r2 != r3) && (r1 != r3)) {
            println("triangulo Escaleno!!!")
        } else {
            println("Triangulo Isoseles!!!")
        }
    } else {
        println("nao e considerado um triangulo")
    }
}

