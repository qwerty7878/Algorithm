class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if ("aeiou".contains(String.valueOf(c))){
                continue;
            }else{
                answer += c;
            }
        }
        return answer;
    }
}