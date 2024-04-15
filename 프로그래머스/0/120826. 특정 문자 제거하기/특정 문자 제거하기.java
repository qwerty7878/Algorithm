class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter,"").toString();
        return answer;
    }
}