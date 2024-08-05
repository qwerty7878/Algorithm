import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>(); //  옷, 경우의 수

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine()," ");
                st.nextToken(); //  옷 이름
                String type = st.nextToken();   //  옷 종류
                map.put(type, map.getOrDefault(type,0) + 1);
                //  종류가 이미 있으면 종류의 기본 갯수에 + 1을
                //  없다면 0에 + 1
            }

            int cnt = 1;
            for (int val : map.values()) {
                cnt *= (val + 1);   //  종류별 안입는경우
            }

            System.out.println(cnt - 1);    //  나체 제외
        }
    }
}