package CodicaoComposta

const val CARPOP = 90
const val CARLX = 150

fun main() {

    println(
        "Voce alugo carro popular ou luxo: \n" +
                "     seleciona tipo:                   \n"
                + "    Popular: p \n"
                + "    Luxo: l"
    )
    val typeAl = readln()

    println("Quantos quilometros(Km) andado? ")
    val quiKm = readln().toFloat()

    println("Quantos dias alugo o carro? ")
    val dayCars = readln().toInt()

    validandoPrice(typeAl, dayCars, quiKm)

}

fun validandoPrice(alg: String, day: Int, km: Float) {
    var year = 0
    var velocPric = 0.0
    when (alg) {
        "p" -> {
            year = day * CARPOP
            if (km <= 100) {
                velocPric = km * 0.20 + (year).toFloat()
                println(String.format("Vai pagar R$%.2f", velocPric))
            } else {
                velocPric = km * 0.10 + (year).toFloat()
                println(String.format("Vai pagar R$%.2f", velocPric))
            }
        }
        "l" -> {
            year = day * CARLX
            if (km <= 200) {
                velocPric = km * 0.30 + (year).toFloat()
                println(String.format("Vai pagar R$%.2f", velocPric))
            } else {
                velocPric = km * 0.25 + (year).toFloat()
                println(String.format("Vai pagar R$%.2f", velocPric))
            }
        }
    }
}