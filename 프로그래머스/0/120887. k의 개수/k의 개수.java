class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        String strK = String.valueOf(k);
        for(int a = i; a <= j; a++){
            String value = String.valueOf(a);
            if(value.contains(strK)){
                String[] arr = value.split("");
                for(String alpha : arr){
                    if(alpha.equals(strK))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}