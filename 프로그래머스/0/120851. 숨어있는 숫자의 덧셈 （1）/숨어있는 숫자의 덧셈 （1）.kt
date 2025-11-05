class Solution {
    fun solution(my_string: String): Int {
        var answer = my_string.filter{ it.isDigit() }
            .map{ it.digitToInt() }
            .toIntArray()
            .sum()
        return answer
    }
}