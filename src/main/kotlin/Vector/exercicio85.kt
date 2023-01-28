package Vector

fun main() {

    var listaNomes = mutableListOf<String>()
    var listasexo = mutableListOf<Char>()
    var listaSalario = mutableListOf<Float>()

    for (i in 1..4){
        print("Nome do funcionario: ")
        val nome = readln()
        listaNomes.add(nome)

        print("Sexo m ou f: ")
        val sexo = readln()[0]
        listasexo.add(sexo)

        print("Salario do funcionario: ")
        val salary = readln().toFloat()
        listaSalario.add(salary)
        println()
    }

  mulhercom5mil(listaNomes,listasexo,listaSalario)


}


private fun mulhercom5mil(listaNom: List<String>,
                          listaSx: List<Char>,listSalary: List<Float>){

    for (s in listSalary.indices) {
        if ((listaSx[s] == 'f') && (listSalary[s] > 5000)) {
            println(String.format("A %s ganha R$%.2f ", listaNom[s], listSalary[s]))
        }
    }
}
