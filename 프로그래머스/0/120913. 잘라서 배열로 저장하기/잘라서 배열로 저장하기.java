import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < my_str.length()/n; i++){
            answer.add(my_str.substring((n * i),(n * (i + 1))));
            //substring(시작위치,끝위치)로 끝 바로 전까지 자름
        }
        // 나누어 지지 않을 경우
        if(my_str.length()%n != 0)
            answer.add(my_str.substring((my_str.length()/n)*n));
                       
        return answer.toArray(new String[0]);
        //list를 []크기의 배열로 전환
    }
}