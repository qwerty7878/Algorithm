class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String temp = "";
        if (s.charAt(0) == '-'){
            temp += '-';
            for (int i = 1; i < s.length(); i++){
                temp += s.charAt(i);
            }
            answer = Integer.parseInt(temp);
        }else{
            for (int i = 0; i < s.length(); i++){
                temp += s.charAt(i);
            }
            answer = Integer.parseInt(temp);
        }
        
        return answer;
    }
}