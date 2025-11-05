class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 1
        for(num in box){
            answer *= (num / n).toInt()
        }
        return answer
    }
}
