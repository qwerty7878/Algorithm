import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            int x;

            if (s.equals("add")) {
                x = Integer.parseInt(st.nextToken());
                set.add(x);
            } else if (s.equals("remove")) {
                x = Integer.parseInt(st.nextToken());
                set.remove(x);
            } else if (s.equals("check")) {
                x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("toggle")) {
                x = Integer.parseInt(st.nextToken());
                if (!set.contains(x)) {
                    set.add(x);
                } else {
                    set.remove(x);
                }
            } else if (s.equals("all")) {
                set = new HashSet<>();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (s.equals("empty")) {
                set.clear();
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}