import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String sArray[] = my_string.toLowerCase().split("");
        
        Arrays.sort(sArray);
        for(int i = 0; i < sArray.length; i++){
            answer += sArray[i];
        }
        return answer;
    }
}