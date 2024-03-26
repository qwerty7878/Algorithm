import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int [26];
        int sum = 0;

        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        for(char c : a) arr[c-97]++;
        for(char c : b) arr[c-97]--;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0)
                sum += Math.abs(arr[i]);
        }
        System.out.println(sum);
    }
}