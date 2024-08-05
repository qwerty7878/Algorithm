import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0,0,-1,1};
    static int n;
    static int cnt;
    static ArrayList<Integer> bulb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bulb = new ArrayList<>();

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];
        cnt = 1;    //  단자 첫번호는 1

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    dfs(i,j);
                    bulb.add(cnt);  //  dfs를 실행하면서 cnt 값 변화됨
                    cnt = 1;    //   다시 초기화
                }
            }
        }

        Collections.sort(bulb);     //  오름차순

        StringBuilder sb = new StringBuilder();
        
        sb.append(bulb.size()).append("\n");
        for (int i = 0; i < bulb.size(); i++) {
            sb.append(bulb.get(i)).append("\n");
        }

        System.out.println(sb.toString());
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (!visited[nx][ny] && arr[nx][ny] == 1) {
                    cnt++;
                    dfs(nx, ny);
                }
            }
        }
    }
}