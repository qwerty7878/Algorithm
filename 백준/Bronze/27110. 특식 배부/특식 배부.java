import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [3];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > n)
                arr[i] = n;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}