class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        
        for(int a = i; a <= j; a++){
            str += a+"";
        }
        return str.length() - str.replace(k+"","").length();
        //모든 문자열 길이 - k제외 나머지를 ""로 바꾼 후 뺀 길이 리턴

// 다른 풀이
//      class Solution {
//         public int solution(int i, int j, int k) {
//             int cnt = 0;
//             String strK = String.valueOf(k);
//             for(int a = i; a <= j; a++){
//                 String value = String.valueOf(a);
//                 if(value.contains(strK)){
//                     String[] arr = value.split("");
//                     for(String alpha : arr){
//                         if(alpha.equals(strK))
//                             cnt++;
//                     }
//                 }
//             }
//             return cnt;
//         }
//     }
        
    }
}