class Solution {
    fun solution(money: Int): IntArray {
        val count = money / 5500
        val change = money % 5500
        return intArrayOf(count, change)
    }
}