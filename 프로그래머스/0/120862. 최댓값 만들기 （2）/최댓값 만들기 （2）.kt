class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var newarr = numbers.sorted()
        if ((newarr[0] * newarr[1]) > (newarr[numbers.size - 1] * newarr[numbers.size -2])){
            answer = newarr[0] * newarr[1]
        }else{
            answer = newarr[numbers.size - 1] * newarr[numbers.size - 2]
        }
        return answer
    }
}