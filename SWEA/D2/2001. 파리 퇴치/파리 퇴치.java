import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for(int test = 0; test < t; test++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr[][] = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            int ans = 0;
            for(int i = 0; i <= n - m; i++){
                for(int j = 0; j <= n - m; j++){
                    int sum = 0;
                    for(int x = 0; x < m; x++){
                        for(int y = 0; y < m; y++){
                            sum += arr[i + x][j + y];
                        }
                    }
                    ans = Math.max(ans, sum);
                }
            }

            System.out.printf("#%d %d\n",test + 1,ans);
        }
    }
}
