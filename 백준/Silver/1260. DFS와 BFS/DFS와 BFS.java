import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[];
    static int arr[][];
    static int n;   //  정점 개수
    static int m;   //  간선 개수
    static int start;   //  시작 정점 번호
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());   //  정점 개수
        m = Integer.parseInt(st.nextToken());   //  간선 개수
        start = Integer.parseInt(st.nextToken());   //  시작 정점 번호

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];   //  dfs용 방문여부 확인

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");
        visited = new boolean[n + 1];   //  dfs 확인 끝나면 초기화 후 bfs에 사용
        bfs(start);

        System.out.println(sb.toString());
    }

    static String  dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");
        for (int i = 1; i <= n; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
        return sb.toString();
    }

    static String bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            start = q.poll();
            sb.append(start + " ");
            for (int i = 1; i <= n; i++) {
                if (arr[start][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return sb.toString();
    }
}