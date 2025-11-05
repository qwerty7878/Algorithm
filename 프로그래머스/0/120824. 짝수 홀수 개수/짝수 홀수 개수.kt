class Solution {
    fun solution(num_list: IntArray): IntArray {
        var even = num_list.filter { it % 2 == 0 }.size
        var odd = num_list.filter { it % 2 != 0 }.size
        return intArrayOf(even, odd)
    }
}