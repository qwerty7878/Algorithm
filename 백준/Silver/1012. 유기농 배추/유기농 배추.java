import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static boolean visited[][];
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            m = Integer.parseInt(st.nextToken());   //  가로
            n = Integer.parseInt(st.nextToken());   //  세로
            int k = Integer.parseInt(st.nextToken());   //  배추 개수

            arr = new int[m][n];
            visited = new boolean[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }

            int cnt = 0;
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (!visited[j][l] && arr[j][l] == 1) {
                        dfs(j, l);
                        cnt++;
                    }
                }
            }
            sb.append(cnt);
            System.out.println(sb.toString());
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        //  상하좌우 초기값
        int Mx[] = {-1, 1, 0, 0};   //  x좌표 이동
        int My[] = {0, 0, -1, 1};   //  y좌표 이동

        for (int i = 0; i < 4; i++) {   //  4방향으로 이동
            int Nx = x + Mx[i];
            int Ny = y + My[i];

            if(Nx >= 0 && Nx < m && Ny >= 0 && Ny < n){ //  범위 안에 있으면서
                if (arr[Nx][Ny] == 1 && !visited[Nx][Ny]) {
                    dfs(Nx, Ny);
                }
            }
        }
    }
}