import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String score = br.readLine();

        for (int i = 0; i < score.length(); i++) {
            if (Character.isUpperCase(score.charAt(i))) {
                sb.append(Character.toLowerCase(score.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(score.charAt(i)));
            }
        }
        System.out.println(sb);
    }
}
