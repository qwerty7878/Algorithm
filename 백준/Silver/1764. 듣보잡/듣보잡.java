import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> peopleList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String neverHeardName = br.readLine();
            peopleList.add(neverHeardName);
        }

        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String neverSeenName = br.readLine();
            if (peopleList.contains(neverSeenName)) {
                answer.add(neverSeenName);
            }
        }
        answer = answer.stream().sorted().collect(Collectors.toList());

        sb.append(answer.size()).append("\n");
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}