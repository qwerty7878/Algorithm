class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int [arr.length];
        if(arr.length % 2 != 0){    //  홀수면
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){ //  짝수 인덱스에 더해
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
            }
        }else{  //짝수면
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){ 
                    answer[i] = arr[i];
                }else{  //  홀수 인덱스에 더해
                    answer[i] = arr[i] + n;
                }
            }
        }
        return answer;
    }
}