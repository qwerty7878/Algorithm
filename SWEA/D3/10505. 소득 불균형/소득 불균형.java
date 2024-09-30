import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int tc = 0; tc < t; tc++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            int cnt = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            for(int i = 0; i < n; i++){
                if(sum / n >= arr[i]){
                    cnt++;
                }
            }

            System.out.printf("#%d %d\n",tc + 1, cnt);
        }
    }
}