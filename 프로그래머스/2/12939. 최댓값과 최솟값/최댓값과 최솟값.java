import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.split(" ");
        int Narr[] = new int [arr.length];
        
        for(int i = 0; i < Narr.length; i++){
            Narr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(Narr);
        answer = Narr[0] + " " + Narr[Narr.length -1];
        return answer;
    }
}