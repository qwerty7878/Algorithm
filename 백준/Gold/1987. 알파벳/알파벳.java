import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static boolean visited[] = new boolean[26];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0,0,-1,1};
    static int r, c;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new int [r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.charAt(j) - 'A';
            }
        }

        backtracking(0, 0, 1);
        System.out.println(max);
    }

    static void backtracking(int x, int y, int cnt) {
        visited[arr[x][y]] = true;
        max = Math.max(max, cnt);

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                if (!visited[arr[nx][ny]]) {
                    backtracking(nx,ny,cnt + 1);
                    visited[arr[nx][ny]] = false;   //  다시 초기화
                }
            }
        }
    }
}