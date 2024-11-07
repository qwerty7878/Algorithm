class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        
        while(s.length() > 1){
            int originlen = s.length();
            s = s.replaceAll("0","");
            
            answer[0]++;
            answer[1] += originlen - s.length();
            s = Integer.toBinaryString(s.length()); 
        }
        return answer;
    }
}