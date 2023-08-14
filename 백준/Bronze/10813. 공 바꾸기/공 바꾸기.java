import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니
        int M = sc.nextInt();
        int temp; //잠시 넣어두었다가 빠질 공간
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1; // 배열은 0부터시작이고 첫번째 바구니부터 들어가니까
        }
        for(int j = 0; j < M; j++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}