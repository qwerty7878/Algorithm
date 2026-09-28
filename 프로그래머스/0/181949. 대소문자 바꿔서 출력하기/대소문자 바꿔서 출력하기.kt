fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    for (ch in s1){
        if (ch.isUpperCase()){
            print(ch.lowercase())
        }else{
            print(ch.uppercase())
        }
    }
}