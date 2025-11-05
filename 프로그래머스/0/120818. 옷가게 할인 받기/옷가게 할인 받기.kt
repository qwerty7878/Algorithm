class Solution {
    fun solution(price: Int): Int {
        var answer = price
        if(price in 100000 until 300000){
            answer = (price * 0.95).toInt()
        }else if(price in 300000 until 500000){
            answer = (price * 0.9).toInt()
        }else if(price >= 500000){
            answer = (price * 0.8).toInt()
        }
        return answer
    }
}