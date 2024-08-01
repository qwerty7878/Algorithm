import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        
        String arr[] = new String[numbers.length];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = "" + numbers[i];
        }
        
        Arrays.sort(arr,(o1,o2) -> (o2 + o1).compareTo(o1 + o2));
        //  문자열 더한거로 비교
        
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        for(int i = 0; i < arr.length; i++){
            answer.append(arr[i]);
        }
        return answer.toString();
    }
}