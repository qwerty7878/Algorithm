import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long arr[] = new long[n + 1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            sb.append(arr[to] - arr[from - 1]).append("\n");
            //구간 합 배열[뒷구간] - 배열[앞구간 -1]
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}