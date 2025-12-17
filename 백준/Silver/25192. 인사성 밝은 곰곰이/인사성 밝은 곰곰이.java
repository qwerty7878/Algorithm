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

        int n = Integer.parseInt(br.readLine());
        Set<String> name = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            if (cmd.equals("ENTER")) {
                count += name.size();
                name = new HashSet<>();
            } else {
                name.add(cmd);
            }
        }
        count += name.size();

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}