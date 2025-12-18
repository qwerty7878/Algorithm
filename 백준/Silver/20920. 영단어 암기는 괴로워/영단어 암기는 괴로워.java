import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() < m) {
                continue;
            }
            words.put(word, words.getOrDefault(word, 1) + 1);
        }

        List<String> list = new ArrayList<>(words.keySet());
        list.sort(((o1, o2) -> {
            int count1 = words.get(o1);
            int count2 = words.get(o2);

//            자주 나오는 단어일수록 앞에 배치한다.
            if (count1 != count2) {
                return count2 - count1;
            }

//            해당 단어의 길이가 길수록 앞에 배치한다.
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }

//            알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
            return o1.compareTo(o2);
        }));

        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}