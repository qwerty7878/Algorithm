class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        val number_1 = numbers.get(numbers.size - 1)
        val number_2 = numbers.get(numbers.size - 2)
        val answer = number_1 * number_2
        return answer
    }
}