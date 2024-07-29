import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        long q1_sum = 0;
        long q2_sum = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1_sum += queue1[i];
        }

        for (int i = 0; i < queue2.length; i++) {
            q2_sum += queue2[i];
        }

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }

        while (q1_sum != q2_sum) {

            int temp = 0;
            
            if(answer > (queue1.length + queue2.length)* 2){
                return -1;
            }
            
            if (q1_sum > q2_sum) {
                temp = q1.poll();
                q2.add(temp);

                q1_sum -= (long)temp;
                q2_sum += (long)temp;
            } else if (q1_sum < q2_sum) {
                temp = q2.poll();
                q1.add(temp);

                q1_sum += (long)temp;
                q2_sum -= (long)temp;
            }
            answer++;
        }
        return answer;
    }
}