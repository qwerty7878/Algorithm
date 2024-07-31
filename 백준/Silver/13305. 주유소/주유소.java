import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int city[] = new int[n - 1];
        int cost[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < city.length; i++) {
            city[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cost.length; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = cost[0] * city[0];    //  초기값 (처음엔 주유해야함)
        int mincost = cost[0];  //  두번째부터 최소 비용 정리

        for (int i = 1; i < city.length; i++) {
            if (mincost > cost[i]) {
                mincost = cost[i];
            }
            sum += mincost * city[i];
        }
        System.out.println(sum);
    }
}