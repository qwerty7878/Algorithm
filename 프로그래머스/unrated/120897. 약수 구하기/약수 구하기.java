import java.util.*;

class Solution {
    public int[] solution(int n) {
        int cnt = 0; // 배열 크기
        
        for(int i = 1; i <= n; i++){
            if(n % i  == 0)
                cnt++;
        }
        
        int[] answer = new int [cnt];
        int index = 0; //배열 안 숫자
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[index] = i;
                index++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}