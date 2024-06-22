class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int j = 0; j < index_list.length; j++){
            answer += my_string.charAt(index_list[j]);
        }
        
        return answer;
    }
}