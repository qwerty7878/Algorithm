import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int arr[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0,0,-1,1};
    static int max = -1;

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //  주어진 입력값
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        //  지도
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //  연구소 전체 탐색
        dfs(0);
        System.out.println(max);
    }

    static void dfs(int wallcnt) {  //  벽 갯수

        if (wallcnt == 3) { //  벽이 3개가 되면 바이러스 퍼지지 않은 곳 카운팅하면됨
            bfs();  //  바이러스 전파
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {   //  벽세우기
                    arr[i][j] = 1;
                    dfs(wallcnt + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        Queue<virus> q = new LinkedList<>();
        int viruslab[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {   //  바이러스가 있으니까
                    q.add(new virus(i, j));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                viruslab[i][j] = arr[i][j];
            }
        }

        while (!q.isEmpty()) {  //  bfs 기본 알고리즘
            virus temp = q.poll();
            int x = temp.x;
            int y = temp.y;

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (viruslab[nx][ny] == 0) {    //  빈칸이면 감염시킨다
                        q.add(new virus(nx, ny));
                        viruslab[nx][ny] = 2;
                    }
                }
            }
        }

        int safezone = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (viruslab[i][j] == 0) {  //  감염이 안된녀석(벽으로 가려져서)
                    safezone++;
                }
            }
        }
        max = Math.max(safezone, max);
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