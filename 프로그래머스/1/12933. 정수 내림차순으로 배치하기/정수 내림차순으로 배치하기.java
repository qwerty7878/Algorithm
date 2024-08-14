import java.util.*; 

import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String s = "" + n;
        String arr[] = s.split("");
        
        Arrays.sort(arr);
        
        for(int i = arr.length - 1; i >= 0; i--){
            answer += arr[i];
        }
        
        return Long.parseLong(answer);
    }
}