package EquantoFlag

fun main() {

    idadeSexo()

}


private fun idadeSexo() {
    var cdastrHom = 0
    var totAgehom = 0
    var maiorAge = 0
    var youngWom = 1000

    var cont = 1
    while (cont <= 1) {
        println(
            "===============\n" +
                    "Digite a sua idade:\n" +
                    "==============="
        )
        val age = readln().toInt()

        println(
            "===============\n" +
                    "seleciona o sexo:\n" +
                    "digite m: masculino f: feminino\n" +
                    "==============="
        )
        val sexo = readln()[0]

        if (age >= maiorAge) maiorAge = age

        when (sexo) {
            'm' -> {
                totAgehom += age
                cdastrHom++
            }
            'f' -> {
                if (age <= youngWom) youngWom = age
            }
            else -> {
                println("Informação incorreta")
                cont++
            }
        }
        println(
            "==================\n" +
                    "Deseja continuar\n" +
                    "sim: y nao: n\n" +
                    "=================="
        )
        val escCont = readln()[0]

        if ((escCont == 'y') || (escCont == 'Y')) {

        } else if ((escCont == 'n') || (escCont == 'N')) {
            println("Fim")
            cont++
        }
    }
    println("A maior idade foi $maiorAge anos")
    println("teve $cdastrHom homens cadastrado")

    if (youngWom == 1000) println("Nao teve mulher") else println("A mulher mais jovem foi $youngWom anos")
    println("A idade media dos homens foi ${totAgehom / cdastrHom} anos")
}