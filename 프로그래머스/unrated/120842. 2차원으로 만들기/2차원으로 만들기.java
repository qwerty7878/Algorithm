class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        int[][] answer = new int [num_list.length/n][n];
        int cnt = 0; 
        //num_list 안에 들어간 숫자 순서에 관련된 수임 for문을 통해 증감되면서 다음 수로 넘어감
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}