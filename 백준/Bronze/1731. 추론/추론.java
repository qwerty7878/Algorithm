import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[2] - arr[1] == arr[1] - arr[0])
            System.out.println(arr[arr.length - 1] + (arr[1] - arr[0]));
        else
            System.out.println(arr[arr.length - 1] * (arr[1] / arr[0]));   
    }
}