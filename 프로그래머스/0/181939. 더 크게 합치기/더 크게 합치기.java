class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        String ab = aa + bb;
        String ba = bb + aa;
        
        int aab = Integer.valueOf(ab);
        int bba = Integer.valueOf(ba);
        
        if(aab >= bba)
            return aab;
        else
            return bba;
    }
}