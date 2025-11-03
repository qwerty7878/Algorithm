class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        val answer = numbers.sliceArray(num1..num2)
        return answer
    }
}