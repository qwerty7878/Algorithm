class Solution {
    fun solution(array: IntArray): Int {
        array.sort()
        var len = array.size / 2
        return array[len]
    }
}