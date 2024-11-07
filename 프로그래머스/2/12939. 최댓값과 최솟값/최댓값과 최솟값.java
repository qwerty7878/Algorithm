import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int arr[] = new int [answer.length];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(answer[i]);
        }
        Arrays.sort(arr);
        return "" + arr[0] + " " + arr[arr.length - 1];
    }
}