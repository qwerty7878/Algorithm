import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();   
        //  정수형으로 리스트를 배열로 변환
    }
}