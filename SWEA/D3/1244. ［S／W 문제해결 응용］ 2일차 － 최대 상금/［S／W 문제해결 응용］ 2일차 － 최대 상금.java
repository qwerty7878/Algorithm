import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static int change;
    static int max;
    static String arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            arr = s.split("");
            change = Integer.parseInt(st.nextToken());

            max = 0;
            if (arr.length < change) {
                change = arr.length;
            }

            dfs(0, 0);
            System.out.printf("#%d %d\n", (tc + 1), max);
        }
    }

    static void dfs(int start, int cnt) {
        if (cnt == change) {
            String ans = "";
            for (String s : arr) {
                ans += s;
            }
            max = Math.max(max, Integer.parseInt(ans));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i, cnt + 1);

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
