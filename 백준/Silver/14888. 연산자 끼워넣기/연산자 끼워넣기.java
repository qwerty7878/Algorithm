import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int t;
    static int num[];
    static int operator[] = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());
        num = new int[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for  (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(num[0], 1);

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(min);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backTracking(int number, int idx) {
        if (idx == t) {
            max = Math.max(max, number);
            min = Math.min(min, number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0: backTracking(number + num[idx], idx + 1); break;
                    case 1: backTracking(number - num[idx], idx + 1); break;
                    case 2: backTracking(number * num[idx], idx + 1); break;
                    case 3: backTracking(number / num[idx], idx + 1); break;
                }

                operator[i]++;
            }
        }
    }
}