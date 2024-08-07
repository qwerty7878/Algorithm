import java.io.*;
import java.util.*;

public class Main {
    static int visited[] = new int[100001];
    static int k;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
        } else {
            bfs(n);
        }
    }
    static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == k) {
                    System.out.println(visited[temp]);
                    return;
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    q.add(next);
                    visited[next] = visited[temp] + 1;
                }
            }
        }
    }
}
