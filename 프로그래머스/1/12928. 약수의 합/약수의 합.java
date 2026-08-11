import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = sumArray(divnum(n));
        return answer;
    }
    
    private int sumArray(List<Integer> list){
        return list.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }
    
    private List<Integer> divnum(int n){
        List<Integer> list = new LinkedList<>();
        
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        return list;
    }
}