import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            cnt++;
        }
        sb.append(cnt).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}