import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> dq = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        int arr[] = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int half = 0;   //  중간값
            int idx = dq.indexOf(arr[i]);   //  인덱스값

            if (dq.size() % 2 == 0) {
                half = dq.size() / 2 - 1;
            } else {
                half = dq.size() / 2;
            }

            if (half >= idx) {   //  앞에 있다
                for (int j = 0; j < idx; j++) {
                    dq.addLast(dq.pollFirst());
                    cnt++;
                }
            } else {    //  뒤에 있다
                for (int j = 0; j < dq.size() - idx; j++) {
                    dq.addFirst(dq.pollLast());
                    cnt++;
                }
            }
            dq.poll();  //  1번
        }
        System.out.println(cnt);
    }
}