class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n+1)/2];
        // 홀수의 경우 n개 이하의 홀수가 배열의 저장되기 위해서는 n을 쓰면 1칸이 부족하게 됨
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1)          // 홀수인 경우
                answer[i/2] = i;
        }
        return answer;
    }
}