import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        
        sb.append("<");
        while (q.size() != 0) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.poll());
            }
            if (q.size() >= 2) {
                sb.append(q.poll()).append(", ");
            } else {
                sb.append(q.poll());
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}

