import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tc = 0; tc < 10; tc++){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for(int i = 2; i < arr.length - 2; i++){
                int left = Math.max(arr[i - 2], arr[i - 1]);
                int right = Math.max(arr[i + 1], arr[i + 2]);
                if(arr[i] > Math.max(left, right)){
                    ans += arr[i] - Math.max(left, right);
                }   
            }

            System.out.println("#" + (tc + 1) + " " + ans);
        }
    }
}