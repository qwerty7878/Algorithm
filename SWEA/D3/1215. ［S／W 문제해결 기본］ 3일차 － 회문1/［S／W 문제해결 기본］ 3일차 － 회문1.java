import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {

            char arr[][] = new char[8][8];

            int findlen = sc.nextInt();

            for (int i = 0; i < 8; i++) {
                String s = sc.next();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }

            int cnt = 0;
            boolean isreverse = true;

            //  가로
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - findlen + 1; j++) {
                    isreverse = true;
                    for (int k = 0; k < findlen / 2; k++) {
                        if (arr[i][j + k] != arr[i][j + findlen - k - 1]) {
                            isreverse = false;
                        }
                    }
                    if (isreverse) {
                        cnt++;
                    }
                }
            }

            // 세로
            for (int i = 0; i < arr.length - findlen + 1; i++) {
                for (int j = 0; j < arr.length; j++) {
                    isreverse = true;
                    for (int k = 0; k < findlen /2; k++) {
                        if (arr[i + k][j] != arr[i + findlen - k - 1][j]) {
                            isreverse = false;
                        }
                    }
                    if (isreverse) {
                        cnt++;
                    }
                }
            }

            System.out.printf("#%d %d\n",tc,cnt);
        }
    }
}