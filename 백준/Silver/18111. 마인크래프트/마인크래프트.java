import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int block[][] = new int[n][m];
        int min = 256;
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                block[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, block[i][j]);
                min = Math.min(min, block[i][j]);
            }
        }

        int height = 0;
        int mintime = Integer.MAX_VALUE;

        for (int i = min; i <= max; i++) {
            int bcnt = b;
            int time = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (i < block[j][k]) {  //  높이가 더 낮은경우
                        bcnt += (block[j][k] - i);
                        time += (block[j][k] - i) * 2;
                    } else {
                        bcnt -= (i - block[j][k]);
                        time += (i - block[j][k]);
                    }
                }
            }

            if (bcnt < 0) {
                break;
            }

            if (mintime >= time) {
                mintime = time;
                height = i;
            }
        }
        System.out.println(mintime + " " + height);
    }
}