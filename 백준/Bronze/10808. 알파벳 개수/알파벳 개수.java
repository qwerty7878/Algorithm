import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int alpha[] = new int[26];

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alpha.length; i++) {
            sb.append(alpha[i]).append(" ");
        }
        System.out.println(sb);
    }
}