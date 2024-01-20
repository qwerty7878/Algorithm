import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        //arraylist는 가변적 배열 + 저장순서 유지 + 중복허용함
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                list.add(i);
            }
        }
        int answer[] = new int [list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i); // get은 리턴하겠다는 뜻임
        }
        return answer;
    }
}