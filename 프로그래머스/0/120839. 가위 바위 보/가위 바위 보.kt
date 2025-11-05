class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        for (ch in rsp){
            var temp = ch.digitToInt()
            if (temp == 2){
                answer += "0"
            }else if(temp == 0){
                answer += "5"
            }else if(temp == 5){
                answer += "2"
            }
        }
        return answer
    }
}