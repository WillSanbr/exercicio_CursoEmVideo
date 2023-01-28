package EquantoFlag

fun main() {

    salarioFuncion()


}


fun salarioFuncion() {
    var totsalHom = 0.0f
    var totsalMul = 0.0f
    var cont = 1
    while (cont <= 1) {
        println("Qual é seu salario? ")
        val salary = readln().toFloat()

        println(
            "=====================\n" +
                    "seleciona o seu sexo:\n" +
                    "homem: m " +
                    "femino: f\n" +
                    "====================="
        )
        val sexo = readln()[0]

        if (sexo == 'm') {
            totsalHom += salary
        } else if (sexo == 'f') {
            totsalMul += salary
        }
        println(
            "=====================\n" +
                    "Deseja continuar?\n" +
                    "digite sim: y\n" +
                    "digite nao: n\n" +
                    "====================="
        )
        val tomaEsc = readln()[0]

        if ((tomaEsc == 'y') || (tomaEsc == 'Y')) {

        } else if ((tomaEsc == 'n') || (tomaEsc == 'N')) {
            cont++
        }else{
            println("Erro dx45535")
            cont++
        }
    }
    println(String.format("O total de salario pago aos homens foi R$%.2f", totsalHom))
    println(String.format("O total de salario pago as mulheres foi R$%.2f", totsalMul))
}









