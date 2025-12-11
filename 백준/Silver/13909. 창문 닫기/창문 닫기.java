import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 1;
        for(int i = 2; i * i <= n; i++){
            count ++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}