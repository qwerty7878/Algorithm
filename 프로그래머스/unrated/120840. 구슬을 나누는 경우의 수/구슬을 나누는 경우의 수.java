class Solution {
    public int solution(int balls, int share) {
        return divide(balls, share);
    }
    public int divide(int n, int m){
        if(n == m || m == 0) return 1;
        return divide(n-1,m-1) + divide(n-1,m);
    }
}