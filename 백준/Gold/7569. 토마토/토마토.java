import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int arr[][][];
    static int n,m,h;
    static int dx[] = {-1, 1, 0, 0, 0, 0};
    static int dy[] = {0, 0, -1, 1, 0, 0};
    static int dz[] = {0, 0, 0, 0, -1, 1};
    static Queue<tomato> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        q.add(new tomato(i, j, k));
                    }
                }
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {

        while (!q.isEmpty()) {
            tomato temp = q.poll();
            int z = temp.z;
            int x = temp.x;
            int y = temp.y;

            for (int i = 0; i < 6; i++) {
                int nz = dz[i] + z;
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < n && ny < m && nz < h) {
                    if (arr[nz][nx][ny] == 0) {    //    아직 안 익었으면
                        q.add(new tomato(nz, nx, ny));
                        arr[nz][nx][ny] = arr[z][x][y] + 1;
                    }
                }
            }
        }

        int day = Integer.MIN_VALUE;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == 0) {    //  모두 익지 못하는 상황
                        return -1;
                    }
                    day = Math.max(day, arr[i][j][k]);
                }
            }
        }
        if (day == 1) { //  max 가 1이란 뜻으로 모든 토마토가 익어있는 상태이다.
            return 0;
        } else {
            return day - 1; //  이미 익은 경우만 큐에 저장했기 때문에 익기 전인 하루전으로 간다.
        }
    }
    static class tomato {
        int z;
        int x;
        int y;

        public tomato(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
}