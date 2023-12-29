class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        
        if(direction.equals("left")){
            for(int i = 0; i < numbers.length - 1; i++){
                answer[i] = numbers[i+1];
            }
            answer[numbers.length -1] = numbers[0];
        }
        // left일때 0 ~ numbers.length - 1 범위여야 맨 마지막 자리가 left로 밀린 i + 1이 채워줌
        
        else{
            for(int i = 1; i < numbers.length; i++){
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[numbers.length -1];
        }
        // 1부터 numbers.length 여야 0이 비어있고 그 자리가 right으로 밀린 수가 들어갈 수 있도록 numbers.length - 1 값이 됨
        return answer;
    }
}