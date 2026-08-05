import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i < a.length(); i++){
            char word = a.charAt(i);
            
            if (Character.isLowerCase(word)){
                answer += Character.toUpperCase(word);
            }else{
                answer += Character.toLowerCase(word);
            }
        }
        
        System.out.print(answer);
    }
}