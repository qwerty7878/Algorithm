class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        while(n % x != 1){
            if(n % x == 1)  break;
            else x++;            
        }
        answer = x;
        return answer;
    }
}