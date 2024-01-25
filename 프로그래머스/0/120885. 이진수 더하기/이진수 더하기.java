class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
        
    // Integer.parseInt()로 이진수를 10진수로 그 후 toBinaryString으로 더한 값 2진수로 
    }
}