import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String s = String.valueOf(a * b * c);

        for(int i = 0; i < 10; i++){
            int cnt = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) - '0' == i)    cnt++;
            }
            System.out.println(cnt);
        }
    }
}