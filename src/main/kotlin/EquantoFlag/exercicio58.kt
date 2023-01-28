package EquantoFlag

fun main() {

    idadeDosAlunos()




}


fun idadeDosAlunos(){
    var x = 1
    var totAgem = 0
    var nAlunos = 0
    while (x != 999){
         println("Digite a idade do aluno: ")
         val age = readln().toInt()

        if(age == 999) {
            x = age
        }else{
            totAgem += age
            nAlunos++
        }
    }
    println("Alunos exitem na turma foi $nAlunos alunos")
    println("A media da idade dos alunos é ${totAgem/nAlunos} anos")
}