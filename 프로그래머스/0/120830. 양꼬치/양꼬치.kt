class Solution {
    fun solution(n: Int, k: Int): Int {
        var drink = k - (n / 10)
        var answer = n * 12000 + drink * 2000
        return answer
    }
}