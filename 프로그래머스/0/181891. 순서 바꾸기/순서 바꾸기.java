import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [num_list.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < num_list.length; i++){
            q.add(num_list[i]);
        }
        
        for(int i = 0; i < n; i++){
            q.add(q.poll());
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.poll();
        }
        return answer;
    }
}