class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        // 처음 숫자들 중에서 들어갈 배열의 갯수를 정하기 위해서
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0)
                cnt++;
        }
        
        int[] answer = new int[cnt];
        int index = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[index] = numlist[i];
                index++;
            }
            
            /*
            answer[0] = numlist[a] 처리 후 index++로 
            answer[1]에 들어갈 수가 n의 배수인지를 찾고 그 다음 들어감
            */
        }
        return answer;
    }
}