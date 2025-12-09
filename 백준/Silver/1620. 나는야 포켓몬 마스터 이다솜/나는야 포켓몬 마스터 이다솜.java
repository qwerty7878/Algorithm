import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> pocketmonToNumList = new HashMap<>();
        Map<Integer, String> numToPocketnumList = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            pocketmonToNumList.put(name, (i + 1));
            numToPocketnumList.put(i + 1, name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String question = br.readLine();
//            번호로 물어봣다면
            if (Character.isDigit(question.charAt(0))) {
                int num = Integer.parseInt(question);
                sb.append(numToPocketnumList.get(num)).append("\n");
            } else {
                sb.append(pocketmonToNumList.get(question)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}