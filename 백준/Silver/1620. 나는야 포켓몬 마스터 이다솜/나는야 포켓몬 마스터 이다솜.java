import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> Smap = new HashMap<>();
        HashMap<Integer, String> Nmap = new HashMap<>();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= m; i++) {
            String pockemon = br.readLine();
            Smap.put(pockemon, i);
            Nmap.put(i, pockemon);
        }

        for (int i = 0; i < n; i++) {
            String test = br.readLine();
            if (Character.isDigit(test.charAt(0))) {
                sb.append(Nmap.get(Integer.parseInt(test))).append("\n");
            } else {
                sb.append(Smap.get(test)).append("\n");
            }
        }
        System.out.println(sb);
    }
}

