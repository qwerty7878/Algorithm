class Solution {
    fun solution(hp: Int): Int {
        var answer = (hp / 5).toInt()
        var hp = hp % 5
        if (hp < 3){
            answer += hp
            return answer
        }else{
            while(true){
                if (hp % 3 == 0){
                    answer += (hp / 3).toInt()
                    break
                }else{
                    hp -= 1
                    answer += 1
                }
            }
            return answer
        }
    }
}