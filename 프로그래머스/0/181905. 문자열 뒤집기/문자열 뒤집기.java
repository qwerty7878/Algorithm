class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(s,e + 1)).reverse();
        return answer + sb.toString() + my_string.substring(e + 1,my_string.length());
    }
}