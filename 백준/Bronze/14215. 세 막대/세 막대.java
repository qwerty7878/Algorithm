import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            int angle = sc.nextInt();
            arr[i] = angle;
        }
        Arrays.sort(arr);

        int lineLimit = arr[0] + arr[1] - 1;
        if (lineLimit < arr[2]) {
            arr[2] = lineLimit;
        }
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}