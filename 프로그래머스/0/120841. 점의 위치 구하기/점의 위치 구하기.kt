class Solution {
    fun solution(dot: IntArray): Int {
        val x = dot.get(0)
        val y = dot.get(1)

        return when {
            x >= 0 && y >= 0 -> 1
            x >= 0 && y < 0 ->  4
            x < 0 && y >= 0 -> 2
            else -> 3
        }
    }
}