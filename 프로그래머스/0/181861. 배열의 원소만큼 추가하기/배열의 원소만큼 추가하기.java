import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int len = arr[i];
            for(int j = 0; j < len; j++){
                list.add(arr[i]);
            }
        }
        
        int answer[] = new int [list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}