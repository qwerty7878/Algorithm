class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val sNum = n.toString()
        
        for(num in sNum) {
            answer += num.digitToInt()
        }
        return answer
    }
}