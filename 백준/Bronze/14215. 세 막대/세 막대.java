import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]) System.out.println(sum);
        else System.out.println((arr[0] + arr[1]) * 2 -1);
    }
}