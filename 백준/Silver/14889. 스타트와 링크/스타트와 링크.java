import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int arr[][];
    static int min = Integer.MAX_VALUE;
    static boolean isVisited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0, 0);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

    private static void backTracking(int depth, int idx) {
        if (depth == n / 2) {
            calculateDiff();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                backTracking(depth + 1, i + 1);
                isVisited[i] = false;
            }
        }
    }

    private static void calculateDiff() {
        int start_team = 0;
        int link_team = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isVisited[i] && isVisited[j]) {
                    start_team +=  arr[i][j];
                    start_team += arr[j][i];
                }

                else if (!isVisited[i] && !isVisited[j]) {
                    link_team +=  arr[i][j];
                    link_team += arr[j][i];
                }
            }
        }
        int val = Math.abs(start_team - link_team);

        if (val == 0) {
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(min, val);
    }
}