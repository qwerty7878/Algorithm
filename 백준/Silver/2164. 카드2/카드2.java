import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            if (q.size() == 1) {
                break;
            }

            q.poll();
            q.add(q.poll());
        }

        sb.append(q.poll());

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}