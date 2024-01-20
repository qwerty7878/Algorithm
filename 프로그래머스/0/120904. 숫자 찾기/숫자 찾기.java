class Solution {
    public int solution(int num, int k) {
        String s = Integer.toString(num);
        String arr[] = s.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(Integer.toString(k)))
                return i + 1;
        }
        
        return -1;
    }
    
    /*
    String str_num = String.valueOf(num);
    String str_k = String.valueOf(k);
    
    int answer = str_num.indexOf(str_k);
    return answer < 0 ? -1 : answer + 1;
    */
}