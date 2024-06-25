class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'A'){
                change += 'B';
            }else{
                change += 'A';
            }
        }
        
        if(change.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}