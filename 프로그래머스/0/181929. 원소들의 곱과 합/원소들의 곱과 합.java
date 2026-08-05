import java.lang.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int gop = 1;
        int sumpow = 0;
        for(int num : num_list){
            gop *= num;
            sumpow += num;
        }
        sumpow = (int)Math.pow(sumpow, 2);
        
        if (sumpow > gop){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}