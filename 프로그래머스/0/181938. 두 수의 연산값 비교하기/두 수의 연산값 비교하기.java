class Solution {
    public int solution(int a, int b) {
        String answer = "";
        int answer1 = 0;
        
        answer = answer + a + b;
        answer1 = 2 * a * b;
        int aanswer = Integer.valueOf(answer);
        
        if(aanswer >= answer1)
            return aanswer;
        else
            return answer1;
    }
}