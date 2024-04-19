class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){ // 약수 1부터 n까지 나누기 반복
            int cnt = 0;
            for(int j = 1; j <= n; j++){ // 1부터 n까지 나눌 수
                if(i % j == 0)  cnt++;
            }
            if(cnt >= 3)    answer++;
        }
        
        return answer;
    }
}