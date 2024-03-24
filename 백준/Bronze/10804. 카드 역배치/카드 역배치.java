import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int [21];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        // 1~20 까지의 수
       
        for(int i = 0; i < 10; i++){ // 10개의 구간 [a,b]
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int temp = 0;
            for(int j = 0; j < (num2 - num1 + 1)/2; j++){
                temp = arr[num1 + j];
                arr[num1 + j] = arr[num2 - j];
                arr[num2 - j] = temp;
            }
        }

        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}