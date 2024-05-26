import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            int cnt = 0;
            int sum = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'O'){
                    cnt++;
                    sum += cnt;
                }
                else
                    cnt = 0;
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}