class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] answer;
        answer = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(String s : answer)
            for(int i = 0; i < morse.length; i++){
                if(s.equals(morse[i]))
                    sb.append(Character.toString(i + 'a'));
            }
        return sb.toString();
    }
}