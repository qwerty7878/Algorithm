class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        
        if(a > b){
            for(int i = b; i <= a; i++){
                sum += i;
            }
        }
        
        else if(a < b){
            for(int i = a; i <= b; i++){
                sum += i;
            }
        }
        
        else sum = a;
        
        answer = sum;
        
        return answer;
    }
}