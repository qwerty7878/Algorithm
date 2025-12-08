import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        List<String> answer = list.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());

//        방법 2
//        Set<String> set = new TreeSet<>(
////                길이순
//                Comparator.comparingInt(String::length)
////                        사전 순
//                        .thenComparing(Comparator.naturalOrder())
//        );
//        set.addAll(list);

        for (String word : answer) {
            sb.append(word).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}