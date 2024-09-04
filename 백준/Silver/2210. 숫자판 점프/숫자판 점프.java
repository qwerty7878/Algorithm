import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int arr[][];
    static int num[];
    static ArrayList<String> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[5][5];
        num = new int[6];
        list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i,j,1);
            }
        }
        System.out.println(list.size());
    }

static void dfs(int x, int y, int cnt) {
    if (cnt > 6) {
        String s = "";
        for (int i = 0; i < 6; i++) {
            s += Integer.toString(num[i]);
        }

        if (list.indexOf(s) < 0) {
            list.add(s);
        }
        return;

    } else {
        num[cnt - 1] = arr[x][y];
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5) {
                    dfs(nx, ny, cnt + 1);
                }
            }
        }
    }
}