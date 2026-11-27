class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String sn = String.valueOf(x);
        int div = 0;
        
        for(int i = 0; i < sn.length(); i++){
            div += Integer.parseInt(String.valueOf(sn.charAt(i)));
        }
        
        if (x % div == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}