class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String sNum = Integer.toString(num);
        String sk = Integer.toString(k);
        
        answer = sNum.indexOf(sk);
        return answer < 0 ? -1 : answer + 1;
    }
}