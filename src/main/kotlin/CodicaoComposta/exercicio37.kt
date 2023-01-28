package CodicaoComposta

fun main() {

    println("Digite o nome do funcionario: ")
    val nome = readln()

    println("Digite o seu genero: m = masculino \t f = femenino")
    val sexo = readln()

    println("Digite o salario do funcionario")
    val salary = readln().toFloat()

    println("Quantos anos trabalha na empresa")
    val yearComp = readln().toInt()

    val altSalary = reajusteSal(sexo, salary, yearComp)
    val result = imprimirTexto(altSalary,nome)

    println(result)

}

fun imprimirTexto(salry: Float, nm: String): String{
    return String.format("O funcionario(a) %s recebeu ajuste de R$%.2f",nm,salry)
}

fun reajusteSal(sx: String, salry: Float, years: Int): Float {
    var reajuste = 0.0f
    when (sx) {
        "f" -> {
            if (years < 15) {
                reajuste = salry + (salry * 0.05f)
            } else if (years in 15..20) {
                reajuste = salry + (salry * 0.12f)
            } else {
                reajuste = salry + (salry * 0.23f)
            }
        }
        "m" -> {
            if (years < 20) {
                reajuste = salry + (salry * 0.03f)
            } else if (years in 20..30) {
                reajuste = salry + (salry * 0.13f)
            } else {
                reajuste = salry + (salry * 0.25f)
            }
        }
        else -> {
            println("Informações incorreta!!!!!")
        }
    }
    return reajuste
}