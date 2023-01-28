package SequenciaBasica

const val LETSPEC = '\n'

fun main() {

    println("Welcome Calculator Bhaskara!!!".uppercase())
    println(LETSPEC)

    println("Digite o numero coeficiente A: ")
    val a = readln().toInt()

    println("Digite o numero coeficiente B: ")
    val b = readln().toInt()

    println("Digite o numero coeficiente C: ")
    val c = readln().toInt()

   val delta: Int = (Math.pow(b.toDouble(),2.0) -  (4 * a * c)).toInt()
   val testDelta = Math.sqrt(delta.toDouble()) //pega variavel delta e valida

    //Expressao valida se o delta negativo ou 0 (NAO TEM COMO CALCULA RAIZ NEGATIVO / ZERO)
    if(testDelta <= 0){
        println("Nao existe Raiz negativo ")
    }else if (testDelta > 0){
       val x1: Int = (- b + testDelta).toInt() / (2*a)
        val x2: Int = (- b - testDelta).toInt() / (2*a)
        println("O valor do delta é $delta")
        println("O calculo das raizes da equações x foi $x1 e $x2")
    }else{
        println("Nao existe raiz ou nao divisil!!!")
    }
}