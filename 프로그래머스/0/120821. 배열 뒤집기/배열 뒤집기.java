class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - 1 - i];
            // num_list.length가 배열 크기라 맨 마지막값은 num_list.length - 1임
            // 마지막 값을 기준으로 i가 0부터 증가할때마다 길이는 점점 감소하게됨
            // 5 4 3 2 1로 배열값을 가져감
        }
        return answer;
    }
}