class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aPb = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int dab = 2 * a * b;
        answer = Math.max(aPb, dab);
        return answer;
    }
}