class Solution {
    fun solution(n: Int): IntArray {
        return (0..n).filter{ it % 2 == 1 }.toIntArray()
    }
}