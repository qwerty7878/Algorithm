class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 6 * n; i++){ 
            // i는 피자조각
            if(6 * i % n == 0){
                // 모두 같은 수로 피자조각을 먹는 순간
                answer = i;
                break;
            }
        }
        return answer;
    }
}