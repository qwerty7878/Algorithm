import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N+1];
        
        for(int i = 0; i <= N; i++){
            arr[i] = i;
        }
        for(int j = 0; j< M; j++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            
            while(I < J){
                temp = arr[J];
                arr[J] = arr[I];
                arr[I] = temp;
                I++;
                J--;
            }
        }
        for(int i = 1; i <= N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}