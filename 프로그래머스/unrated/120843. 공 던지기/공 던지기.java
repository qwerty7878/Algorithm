class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0; //numbers에 들어갈 값
        for(int i = 1; i < k; i++){
            index += 2;
        }
        index %= numbers.length; // index값이 배열 범위를 넘어 갔을 때 다시 돌려놓기 위해서
        answer = numbers[index];
        
        return answer;
    }
}
/* 간단한 풀이 2
class Solution {
    public int solution(int[] numbers, int k) {
        return numbers[ 2 * (k-1) % numbers.length];
    }
}
*/