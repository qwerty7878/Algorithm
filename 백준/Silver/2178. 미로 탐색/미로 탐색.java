import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0,0,-1,1};
    static int n, m;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }

    static void bfs(int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while (!q.isEmpty()) {
            int nxy[] = q.poll();
            int nx = nxy[0];
            int ny = nxy[1];

            for (int i = 0; i < 4; i++) {
                int nextx = nx + dx[i];
                int nexty = ny + dy[i];

                if (nextx >= 0 && nexty >= 0 && nextx < n && nexty < m) {
                    if (!visited[nextx][nexty] && arr[nextx][nexty] == 1) {
                        q.add(new int[]{nextx, nexty});
                        arr[nextx][nexty] = arr[nx][ny] + 1;
                        visited[nextx][nexty] = true;
                    }
                }
            }
        }
    }
}