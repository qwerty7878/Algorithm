class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] s = my_string.split("");
        
        /*
        int num = Integer.parseInt(my_string);
        
        for (int i = 0; i < my_string.length(); i++) {
            answer += num;
        } 123일때 1+2+3이아닌 123을 더하게 됨
        */
        
        for(String i : s){
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}