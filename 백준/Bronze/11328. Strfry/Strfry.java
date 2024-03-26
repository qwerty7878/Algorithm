import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int arr[] = new int [26];
            boolean check = true;
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
            for(char c : a) arr[c-97]++;
            for(char c : b) arr[c-97]--;
            for(int j : arr)
                if(j != 0) check = false;
            System.out.println(check ? "Possible" : "Impossible");
        }
    }
}