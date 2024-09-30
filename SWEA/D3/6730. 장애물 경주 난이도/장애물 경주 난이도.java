import java.util.Scanner;

class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            int n = sc.nextInt();
            int arr[] = new int[n];

            int max = 0;
            int min = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n - 1; i++){
                int temp = 0;
                if(arr[i] < arr[i + 1]){
                    temp = arr[i + 1] - arr[i];
                    if(temp > max){
                        max = temp;
                    }
                }
                else if(arr[i] > arr[i + 1]){
                    temp = arr[i] - arr[i + 1];
                    if(temp > min){
                        min = temp;
                    }
                }

            }

            System.out.printf("#%d %d %d\n",tc + 1, max, min);
        }
    }
}