import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String []str = my_string.replaceAll("[a-zA-Z]","").split("");
        int answer[] = new int [str.length];
        Arrays.sort(str);
        
        for(int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}