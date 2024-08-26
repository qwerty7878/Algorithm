import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0,-1, 1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(arr[i][j], max);
            }
        }
        int answer = 1;
        for (int h = 0; h <= max; h++) {
            int cnt = 0;
            visited = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && arr[i][j] > h) {
                        cnt++;
                        dfs(i,j,h);
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }

    static void dfs(int x, int y, int z) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if ((nx >= 0 && nx < n) && (ny >= 0 && ny < n)) {
                if (arr[nx][ny] > z && !visited[nx][ny]) {
                    dfs(nx,ny,z);
                }
            }
        }
    }
}