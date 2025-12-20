import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int move = (int) Math.pow(2, n) - 1;
        sb.append(move).append("\n");

        hanoi(n, 1, 3, 2);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void hanoi(int n, int start, int end, int to) {
        if (n == 1) {
            sb.append(start + " " + end).append("\n");
            return;
        }
        hanoi(n - 1, start, to, end);
        sb.append(start + " " + end).append("\n");
        hanoi(n - 1, to, end, start);
    }
}