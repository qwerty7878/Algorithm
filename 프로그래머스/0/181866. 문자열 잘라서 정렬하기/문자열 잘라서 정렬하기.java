import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");

        List<String> list = new ArrayList<>();
        for(String s : answer){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        String arr[] = new String [list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        
        return arr;
    }
}