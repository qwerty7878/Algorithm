import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> list;
    static boolean visited[];
    static int arr[];
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list.get(i), Collections.reverseOrder());
        }

        arr = new int[n + 1];
        visited = new boolean[n + 1];
        cnt = 1;

        visited[r] = true;
        arr[r] = 1;
        dfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(arr[i]);
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        arr[start] = cnt;

        for (int i : list.get(start)) {
            if (!visited[i]) {
                arr[i] = cnt++;
                visited[i] = true;
                dfs(i);
            }
        }
    }
}