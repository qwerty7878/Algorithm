class Solution {
    fun solution(array: IntArray, height: Int): Int {
        val answer = array.count { it > height }
        return answer
    }
}