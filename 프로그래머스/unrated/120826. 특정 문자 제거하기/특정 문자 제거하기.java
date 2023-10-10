class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter,"").toString();
        //replace는 대체하는 것이고 trim은 공백을 제거하는 것
        return answer;
    }
}