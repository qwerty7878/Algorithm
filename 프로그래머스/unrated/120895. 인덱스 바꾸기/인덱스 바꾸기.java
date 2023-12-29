class Solution {
    public String solution(String my_string, int num1, int num2) {
        /*
        풀이 1번 기본적인 temp 추가 후 바꾸기
        
        String[] arr = my_string.split("");
        
        String temp = "";
        temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        String answer = String.join("", arr);
        
        return answer;
        */
        
        char[] arr = my_string.toCharArray();
        //String이라는 my_string을 toCharArray로 char화 시킨 후 char 배열에 넣음
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        String answer = my_string.valueOf(arr);
        // valueOf 는 ()안에 적힌 형식으로 객체화 시키는 것임
        return answer;
    }
}