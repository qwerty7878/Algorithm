class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aPb = "" + String.valueOf(a) + String.valueOf(b);
        String bPa = "" + String.valueOf(b) + String.valueOf(a);
        answer = Math.max(Integer.parseInt(aPb), Integer.parseInt(bPa));
        return answer;
    }
}