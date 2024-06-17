import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String sArr[] = s.split(" ");

            for (int j = 0; j < sArr.length; j++) {
                StringBuilder sb = new StringBuilder();
                System.out.print(sb.append(sArr[j]).reverse() + " ");
            }
            System.out.println();
        }
    }
}