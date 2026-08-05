import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] array = a.toCharArray();
        
        for (char c: array){
            System.out.println(c);
        }
    }
}