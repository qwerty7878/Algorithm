import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Set<String> set = new HashSet<>();

        for  (int i = 0; i < s.length(); i++) {
            String ans = "";
            for (int j = i; j < s.length(); j++) {
                ans += s.charAt(j);
                set.add(ans);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(set.size());

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}