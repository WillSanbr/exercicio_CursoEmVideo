package CodicaoBasica

fun main() {

     println("Qual velocidade voce esta andando? ")
     val veloc = readLine()?.toInt()

    if(veloc!! >= 80){
        val mute: Double = (veloc * 5.0)
        println(String.format("O valor da muta é R$%.2f",mute))
    }else{
        println("Nao foi mutado!!! ")
    }




}