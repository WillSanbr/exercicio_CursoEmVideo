package facaEnquanto

fun main() {

    facaIdade()

}


private fun facaIdade() {

    var cont = 0
    var qtdAge = 0
    var totAge = 0
    var age21 = 0
    do {

        println("Digite a sua idade: ")
        val age = readln().toInt()

        qtdAge++
        totAge += age

        if (age >= 21) {
            age21++
        }

        println(
            "======================\n" +
                    "digite c: continuar\n" +
                    "digite p: parar\n" +
                    "======================"
        )
        val tomadEsc = readln()[0]

        if ((tomadEsc == 'c') || (tomadEsc == 'C')) {

        } else if ((tomadEsc == 'p') || (tomadEsc == 'P')) {
            cont++
        }

    } while (cont < 1)

    println("Foram digitas $qtdAge idades")
    println("A media das idades digitadas foram entre ${totAge / qtdAge} anos ")
    println("Pessoas tiveram 21 anos ou mais foram $age21 pessoas")
}

