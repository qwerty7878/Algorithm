import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[];
    static int virus[][];
    static int cnt = 0; //  전파 될 컴퓨터 수
    static int com;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        com = Integer.parseInt(br.readLine());  //  컴퓨터 수
        int net = Integer.parseInt(br.readLine());  //  컴퓨터 쌍의 수

        visited = new boolean[com + 1];  //  감염 여부
        virus = new int[com + 1][com + 1];  //  바이러스에 걸린 컴퓨터
        int startcom = 1;   //  1번 컴퓨터 숙주

        for (int i = 0; i < net; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());   //  쌍 1
            int b = Integer.parseInt(st.nextToken());   //  쌍 2

            virus[a][b] = virus[b][a] = 1;
        }

        sb.append(dfs(startcom));
        System.out.println(sb.toString());
    }

    static int dfs(int startcom) {
        visited[startcom] = true;  //  숙주는 감염되었다.(초기값)

        for (int i = 1; i <= com; i++) {//  나머지 감염여부 확인
            if (virus[startcom][i] == 1 && !visited[i]) {   //  감염되지 않았으면서 숙주와 연결된다면
                cnt++;  //  감염 컴퓨터 수 증가
                dfs(i); //  다른 감염된 애들로 다시 찾기
            }
        }
        return cnt;
    }
}