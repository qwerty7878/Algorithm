class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = strlist[i].length();
            //문자의 길이를 반환하는 거니까 length()
        }
        return answer;
    }
}