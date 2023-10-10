class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){ //어디까지 갈거니? 문자길이까지
            for(int j = 0; j < n; j++){ //몇개를 반복할거니? n개
                answer += my_string.charAt(i);
                //charAt 은 String 타입을 char타입으로 하나씩 뜯는것
            }
        }
        return answer;
    }
}