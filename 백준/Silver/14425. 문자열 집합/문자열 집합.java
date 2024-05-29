import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine()," ");

        HashSet<String> hp = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = 0; i < n; i++){
            hp.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            String s = br.readLine();
            if(hp.contains(s))
                cnt++;
        }
        System.out.println(cnt);
   }
}
