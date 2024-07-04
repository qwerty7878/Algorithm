import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        HashSet<String> h = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            if (s.equals("ENTER")) {
                h.clear();
            } else {
                if (h.contains(s)) {
                    continue;
                }
                h.add(s);
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}