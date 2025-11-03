class Solution {
    fun solution(sides: IntArray): Int {
        val sum = sides.sum()
        val maxNum = sides.maxOf { it }
        if (sum - maxNum * 2 > 0) {
            return 1
        } else {
            return 2
        }
    }
}