package CodicaoComposta

fun main(){

    println("Digite a Largura do terreno (cm): ")
    val ld = readln().toInt()

    println("Digite a Comprimento do terreno (cm): ")
    val cm = readln().toInt()

    val area = cm * ld

    if(area < 100){
        println("Terreno Popular: area $area m2")
    }else if ((area >= 100) && (area < 500 )){
        println("Terreno Master: area $area m2")
    }else if(area == 0){
        println("Preenchido incorretamente!!!")
    }else{
        println("Terreno Vip: area $area m2")
    }
}