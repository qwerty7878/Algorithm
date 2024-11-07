class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_cnt = Integer.bitCount(n);
        int next_cnt = 0;
        
        while(true){
            n++;
            next_cnt = Integer.bitCount(n);
            if(n_cnt == next_cnt){
                answer = n;
                break;
            }
        }
        return answer;
    }
}