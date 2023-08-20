import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Cpaper = sc.nextInt();
        int arr[][] = new int [100][100];
        int cnt = 0;
        
        for(int i = 0; i < Cpaper; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1)
                    cnt += arr[i][j];
            }
        }
        System.out.println(cnt);
    }
}