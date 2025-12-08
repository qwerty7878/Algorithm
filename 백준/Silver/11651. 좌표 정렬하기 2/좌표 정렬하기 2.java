import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int dot[][] = new int[t][2];

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            dot[i][0] = Integer.parseInt(st.nextToken());
            dot[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dot, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < t; i++) {
            sb.append(dot[i][0] + " " + dot[i][1]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}