import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        sb.append("<");
        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll());
            if(q.size() != 0)
                sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb);

    }
}