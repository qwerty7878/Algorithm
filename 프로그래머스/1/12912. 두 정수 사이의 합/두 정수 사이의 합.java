class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int aa = Math.min(a, b);
        b = Math.max(a, b);
        for (int i = aa; i <= b; i++){
            answer += i;
        }
        return answer;
    }
}