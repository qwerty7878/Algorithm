import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        //최대공약수 A
        int numA = arrayA[0];
        for(int i = 1; i < arrayA.length; i++){
            numA = gcd(arrayA[i], numA);
        }
        
        //최대공약수 B
        int numB = arrayB[0];
        for(int i = 1; i < arrayB.length; i++){
            numB = gcd(arrayB[i], numB);
        }
        
        //나눠지는지
        if(candiv(arrayA, numB)){
            answer = Math.max(answer, numB);
        }
        
        if(candiv(arrayB, numA)){
            answer = Math.max(answer, numA);
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }return gcd(b, a % b);
    }
    
    public boolean candiv(int arr[], int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % num == 0){
                return false;
            }
        }
        return true;
    }
}