import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0,0,-1,1};
    static int n, m;
    static int max = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(max);
    }

    static void dfs(int wallcnt) {

        if (wallcnt == 3) {
            bfs();  //  바이러스 퍼짐
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {   //  빈칸인 경우 벽 세우고 벽 갯수 1개 증가 싴키기
                    arr[i][j] = 1;
                    dfs(wallcnt+1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        Queue<virus> q = new LinkedList<>();
        int virusarr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {
                    q.add(new virus(i, j));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                virusarr[i][j] = arr[i][j];
            }
        }

        while (!q.isEmpty()) {
            virus temp = q.poll();
            int x = temp.x;
            int y = temp.y;

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (virusarr[nx][ny] == 0) {
                        q.add(new virus(nx, ny));
                        virusarr[nx][ny] = 2;
                    }
                }
            }
        }

        int safezone = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (virusarr[i][j] == 0) {
                    safezone++;
                }
            }
        }
        max = Math.max(max, safezone);
    }

    static class virus {
        int x;
        int y;

        public virus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}