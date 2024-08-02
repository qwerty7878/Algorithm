import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int vol[][] = new int[n][t];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                vol[j][0] = Integer.parseInt(st.nextToken());  //  서류
                vol[j][1] = Integer.parseInt(st.nextToken());  //  면접
            }

            Arrays.sort(vol, new Comparator<int[]>() {  //  서류점수 기준 정렬
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });

            int first = vol[0][1];  //  서류 1등의 면접점수
            int cnt = 1;    //  서류 1등 포함,합격자

            for (int j = 1; j < vol.length; j++) {
                if (first > vol[j][1]) {    //  서류 1등의 면접점수보다 좋아야 합격임
                    first = vol[j][1];  //  합격 컷
                    cnt++;
                }

            }
            System.out.println(cnt);
        }
    }
}