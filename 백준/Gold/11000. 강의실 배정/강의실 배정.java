import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int room[][] = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            room[i][0] = Integer.parseInt(st.nextToken());
            room[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(room[0][1]);

        for (int i = 1; i < room.length; i++) {
            if (q.peek() <= room[i][0]) {   //  시간이 같을 수 만은 없음 공강이 존재할 수도
                q.poll();   //  시간표 짝 맞으니 빼줘
            }
            q.add(room[i][1]);  //  짝 찾을려고 통 안에 넣어줘
        }
        System.out.println(q.size());
    }
}