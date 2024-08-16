import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //given
        int t = Integer.parseInt(br.readLine());

        //when
        for (int i = 0; i < t; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(),"[],");
            ArrayDeque<Integer> dq = new ArrayDeque<>();

            for (int j = 0; j < n; j++) {
                dq.add(Integer.parseInt(st.nextToken()));
            }

            AC(dq, p);
        }
        //then
        System.out.println(sb.toString());
    }

    static void AC(ArrayDeque<Integer> dq, String p) {
        boolean isreverse = true;   //  뒤집혔는지 유무 확인

        for (int i = 0; i < p.length(); i++) {  //  문자열 안에서 RD 구분하기위해서 문자열크기만큼
            if (p.charAt(i) == 'R') {   //  R이면 뒤집기
                isreverse = !isreverse;
                continue;

            }
            if (isreverse) {
                if (dq.pollFirst() == null) {
                    sb.append("error").append("\n");
                    return;
                }
            } else {
                if (dq.pollLast() == null) {
                    sb.append("error").append("\n");
                    return;
                }
            }
        }

        sb.append("[");
        if (!dq.isEmpty()) {
            if (isreverse) {
                sb.append(dq.pollFirst());
                while (!dq.isEmpty()) {
                    sb.append(",").append(dq.pollFirst());
                }
            } else {
                sb.append(dq.pollLast());
                while (!dq.isEmpty()) {
                    sb.append(",").append(dq.pollLast());
                }
            }
        }sb.append("]").append("\n");
    }
}