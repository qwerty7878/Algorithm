import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());    //  색종이 수 
        boolean arr[][] = new boolean[101][101];    //  가로 세로 크기 각각 100인 정사각형 모양 흰색 도화지
        int cnt = 0;    //  검은색 영역

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());   //  왼쪽
            int m = Integer.parseInt(st.nextToken());   //  오른쪽

            for (int j = n; j < n + 10; j++) {  // 10을 더하는 이유는 크기가 10인 검은색 색종이를 붙이니까
                for (int k = m; k < m + 10; k++) {  //  색종이 아래쪽 변과 도화지의 아래쪽 변사이 거리
                    // 두 거리를 곱하는 느낌?
                    if (!arr[j][k]) {   //  도화지에 검은색 부분이니까 cnt값 증가
                        arr[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}