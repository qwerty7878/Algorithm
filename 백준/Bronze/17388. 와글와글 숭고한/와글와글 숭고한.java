import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [3];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum >= 100)
            System.out.println("OK");
        else{
            if(Math.min(Math.min(arr[0],arr[1]),arr[2]) == arr[0])
                System.out.println("Soongsil");
            else if(Math.min(Math.min(arr[0],arr[1]),arr[2]) == arr[1])
                System.out.println("Korea");
            else if(Math.min(Math.min(arr[0],arr[1]),arr[2]) == arr[2])
                System.out.println("Hanyang");
        }
    }
}