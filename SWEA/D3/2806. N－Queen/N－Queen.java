import java.util.Scanner;

class Solution {
    static int arr[];
    static int n;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            cnt = 0;

            n = sc.nextInt();
            arr = new int [n];

            nqueen(0);
            System.out.printf("#%d %d\n", (tc + 1), cnt);
        }
    }

    static void nqueen(int depth){
        if(depth == n){
            cnt++;
            return;
        }

        for(int i = 0; i < n; i++){
            arr[depth] = i;
            if (isPossible(depth)) {
                nqueen(depth + 1);
            }
        }
    }

    static boolean isPossible(int depth){
        for(int i = 0; i < depth; i++){
            if(arr[depth] == arr[i]){
                return false;
            } else if (Math.abs(arr[depth] - arr[i]) == (depth - i)) {
                return false;
            }
        }

        return true;
    }
}