import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [6];
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0]*3 + arr[1]*2 + arr[2] < arr[3]*3 + arr[4]*2 + arr[5])
                System.out.println("B");
        else if(arr[0]*3 + arr[1]*2 + arr[2] > arr[3]*3 + arr[4]*2 + arr[5])
                System.out.println("A");
        else if(arr[0]*3 + arr[1]*2 + arr[2] == arr[3]*3 + arr[4]*2 + arr[5])
                System.out.println("T");
    }
}    