import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int room[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            room[i][0] = Integer.parseInt(st.nextToken());  //  시작점
            room[i][1] = Integer.parseInt(st.nextToken());  //  끝점
        }

        Arrays.sort(room, new Comparator<int[]>() { // 끝나는 순으로 2차원 정렬
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {   //  끝나는 시간이 같다면
                    return o1[0] - o2[0];   //  시작시간이 빠른 순으로
                }
                return o1[1] - o2[1];
            }
        });

        int first_start_end = 0;   //  초기값
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (room[i][0] >= first_start_end) {    //  시작점이 끝점 보다 커야함
                first_start_end = room[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}