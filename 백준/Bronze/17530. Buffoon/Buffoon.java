import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int max = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i])
                max = arr[i];
        }
        if(arr[0] >= max)
            System.out.println("S");
        else
            System.out.println("N");
    }
}