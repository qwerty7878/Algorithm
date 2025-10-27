class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for (num in 0..n){
            if (num % 2 == 0){
                answer += num
            }
        }
        return answer
    }
}