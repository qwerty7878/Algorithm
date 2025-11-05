class Solution {
    fun solution(numbers: IntArray): Int {
        var numbers = numbers
            .sorted()
        var answer = 0
        if (numbers.get(0) * numbers.get(1) > numbers.get(numbers.size - 1) * numbers.get(numbers.size -2)){
            answer = numbers.get(0) * numbers.get(1)
        }else{
            answer = numbers.get(numbers.size - 1) * numbers.get(numbers.size - 2)
        }
        return answer
    }
}