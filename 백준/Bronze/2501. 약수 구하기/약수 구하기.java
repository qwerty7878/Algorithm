import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                list.add(i);
        }

        int arr[] = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        if(arr.length > k - 1)
            System.out.println(arr[k - 1]);
        else if(arr.length == 1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}