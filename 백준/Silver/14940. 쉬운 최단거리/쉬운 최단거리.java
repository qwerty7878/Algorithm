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

        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    arr[i][j] = 0;
                    x = i;
                    y = j;
                }
            }
        }
        bfs(x, y);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) { //  갈 수 있는데 도달할 수 없는 위치
                    arr[i][j] = -1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void bfs(int x, int y) {
        Queue<point> q = new LinkedList<>();
        q.add(new point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            point t = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && arr[nx][ny] == 1) {
                        q.add(new point(nx, ny));
                        visited[nx][ny] = true;
                        arr[nx][ny] = arr[t.x][t.y] + 1;
                    }
                }
            }
        }
    }
}
class point {
    int x;
    int y;
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
