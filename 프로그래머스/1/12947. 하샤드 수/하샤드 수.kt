class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var s = x.toString()
        var temp = 0
        for (i in s){
            temp += i.digitToInt()
        }
        if (x % temp == 0){
            answer = true
        }
        else{
            answer = false
        }
        return answer
    }
}