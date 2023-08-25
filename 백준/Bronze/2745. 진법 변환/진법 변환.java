import java.util.*;
public class Main{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
       String n = sc.next();
       int b = sc.nextInt();
       
       int result = 0;
       int temp = 1;
       for(int i = n.length() -1; i >= 0; i--){
           char c = n.charAt(i);
           if('A' <= c && 'Z' >= c)
               result += (c-'A'+10)*temp;
           else
               result += (c-'0')*temp;
           temp *= b;
       }
       System.out.println(result);
   }
}