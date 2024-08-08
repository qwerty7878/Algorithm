import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static boolean visited[];
    static int start, end,n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());    //  전체 사람 수

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());   //  촌수 계산 두 사람
        end = Integer.parseInt(st.nextToken());     //  촌수 계산 두 사람

        int m = Integer.parseInt(br.readLine());    //  부모 자식들 간의 관계 개수

        for (int i = 0; i < m; i++) {   //  부모자식간의 관계
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;  //  dfs 서로 대칭이라는 증거
        }
        System.out.println(dfs(start, end, 0));     //  두 사람 촌수 계산, 촌수
    }
    static int dfs(int start, int end, int cnt) {
        visited[start] = true;  //  방문시 true로 흔적남기기
        if (start == end) {     //  같은 촌수의 사람인 경우 촌수 리턴
            return cnt;
        }
        for (int i = 1; i <= n; i++) {  //  촌수는 1촌부터 전체 사람 수만큼 반복(찾기)
            if (!visited[i] && arr[start][i] == 1) {    //  start와 연결된 가족이면서 아직 검사가 안된 경우
                visited[i] = true;  //  흔적남기기
                int temp = dfs(i, end, cnt + 1);
                if (temp != -1) {   //  -1이 아닌경우 예외처리
                    return temp;
                }
            }
        }
        return -1;  //  디폴트 촌수 계산 불가능한 경우
    }
}
