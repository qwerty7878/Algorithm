import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for(int i = 0; i< n; i++){
            arr1[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;
        for(int i = 0; i< n; i++){
            if(v == arr1[i])
                count++;
        }
        System.out.println(count);
    }
}