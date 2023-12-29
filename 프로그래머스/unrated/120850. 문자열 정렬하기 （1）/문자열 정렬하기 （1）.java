import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        String[] arr = my_string.replaceAll("[a-zA-z]","").split("");
        Arrays.sort(arr);
        
        int[] answer = new int [arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}