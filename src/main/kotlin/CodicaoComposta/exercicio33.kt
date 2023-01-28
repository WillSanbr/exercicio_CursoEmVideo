fun main() {

    println("Informe o valor da casa R$: ")
    val houseVl = readln().toFloat()

    println("Informe seu salario R$: ")
    val salary = readln().toFloat()

    println("Quantos anos para pagar: ")
    val yearPay = readln().toInt()

    verifEmpr(houseVl, salary, yearPay)

}

fun verifEmpr(vh: Float, sal: Float, yearPay: Int) {

    val mes = yearPay * 12
    val pres = vh / mes

    if (pres > sal * 0.3) {
        println("infelizmente voce nao pode obter emprestimo")
    } else {
        println(String.format("Valor da prestação é R$%7.2f", pres))
    }
}

