import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int n, k;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];

        bfs();
        System.out.println(min);
    }
    static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(n, 0));
        visited[n] = true;

        while (!q.isEmpty()) {
            Point point = q.poll();

            if (point.x == k) {     //  정확한 값인 경우
                min = Math.min(min, point.time);
            }
            if (point.x * 2 <= 100000 && !visited[point.x * 2]) {   //  순간이동
                q.add(new Point(point.x * 2, point.time));
                visited[point.x * 2] = true;
            }
            if (point.x - 1 >= 0  && !visited[point.x - 1]) {   //  1초후 -1 이동
                q.add(new Point(point.x - 1, point.time + 1));
                visited[point.x - 1] = true;
            }
            if (point.x + 1 <= 100000 && !visited[point.x + 1]) {   //  1초후 +1 이동
                q.add(new Point(point.x + 1, point.time + 1));
                visited[point.x + 1] = true;
            }
        }
    }
    static class Point {
        int x;
        int time;

        public Point(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
}