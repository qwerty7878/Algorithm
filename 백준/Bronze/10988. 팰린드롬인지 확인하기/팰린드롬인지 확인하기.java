import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int mid = len/2;
        int result = 1;
        
        for(int i = 0; i < mid; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}