import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> rainbowDance = new HashSet<>();
//        기록이 시작되기 이전 무지개 댄스를 추고 있는 사람은 총총이 뿐
        rainbowDance.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String meetUserA = st.nextToken();
            String meetUserB = st.nextToken();

            if (rainbowDance.contains(meetUserA) ||  rainbowDance.contains(meetUserB)) {
                rainbowDance.add(meetUserA);
                rainbowDance.add(meetUserB);
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(rainbowDance.size());

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}