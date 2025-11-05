class Solution {
    fun solution(my_string: String): IntArray {
        var answer = my_string.filter{ it.isDigit() }
            .map{ it.digitToInt() }
            .sorted()
            .toIntArray()
        return answer
    }
}