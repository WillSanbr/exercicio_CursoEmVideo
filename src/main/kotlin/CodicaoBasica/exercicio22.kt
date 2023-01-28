package CodicaoBasica

fun main() {

    println("Verificar o ALISTAMENTO MILITAR!!!" )
    println("Digite a sua idade:")
    val age = readln().toInt()

     if(age < 18){
          var fatlAge = 18 - age
         println("Falta $fatlAge anos para se Alistar!!!")
     }else if(age == 18){
          println("Esta na hora de se Alistar!!!")
     }else{
         val pastAge = age - 18
         println("Ja se passaram $pastAge anos")
     }

}