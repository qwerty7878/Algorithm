class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;
        for(int i = num1; i <= num2; i++){
            answer[index] = numbers[i];
            //answer은 배열을 자른거라 0 1 2가 되지만 number에서는 1 2 3자리의 값이되므로
            index++;
        }
        return answer;
    }
}