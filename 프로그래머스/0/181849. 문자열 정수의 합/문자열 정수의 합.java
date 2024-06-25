class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String sArr[] = num_str.split("");
        for(int i = 0; i < sArr.length; i++){
            answer += Integer.parseInt(sArr[i]);
        }
        return answer;
    }
}