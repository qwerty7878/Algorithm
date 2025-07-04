class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var res = mutableListOf<Int>()
        var even: Int = 0
        var odd: Int = 0
        for (i in num_list){
            if (i % 2 != 0){
                odd += 1
            }else{
                even += 1
            }
        }
        res.add(even)
        res.add(odd)
        answer = res.toIntArray()
        return answer
    }
}