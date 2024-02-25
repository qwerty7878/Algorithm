class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0)
                even = even + num_list[i];
            else
                odd = odd + num_list[i];
        }
        answer = Integer.valueOf(even) + Integer.valueOf(odd);
        return answer;
    }
}

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0)
                even = even + Integer.toString(num_list[i]);
            else
                odd = odd + Integer.toString(num_list[i]);
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
