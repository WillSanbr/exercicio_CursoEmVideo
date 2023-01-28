package repeticaoEquanto

fun main() {

    divisil4()

}


fun divisil4(){
    var n = 1
    while (n <= 30){
        if(n % 4 == 0){
            print("[$n] ")
        }else{
            print("$n ")
        }
            n++
    }
}







