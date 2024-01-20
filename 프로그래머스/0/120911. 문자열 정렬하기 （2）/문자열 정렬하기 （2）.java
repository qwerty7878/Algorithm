import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arry = my_string.toLowerCase().split("");
        
        Arrays.sort(arry);
        
        for(int i = 0; i < arry.length; i++){
            answer += arry[i];   
        }        
        return answer;
    }
    
    /*
    다른 풀이 
    
    char[] c = my_string.toLowerCase().toCharArray();
    Arrays.sort(c);
    return new String(c);
    
    */
}