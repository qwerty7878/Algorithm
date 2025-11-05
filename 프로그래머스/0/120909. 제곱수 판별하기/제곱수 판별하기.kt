import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        val num = sqrt(n.toDouble()).toInt()
        if (Math.pow(num.toDouble(), 2.0) == n.toDouble()) {
            return 1
        } else {
            return 2
        }
    }
}