class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        var sum = 0
        for (i in 0 until absolutes.size){
            if (signs[i] == true){
                sum += absolutes[i]
            }else{
                sum -= absolutes[i]
            }
        }
        answer = sum
        return answer
    }
}