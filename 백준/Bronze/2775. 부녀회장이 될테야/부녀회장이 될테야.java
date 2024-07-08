import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());    //  testcase
        int apt[][] = new int[15][15];  // 14까지니까

        for (int i = 0; i < 15; i++) {  //  기본값 설정
            apt[i][1] = 1;  // i층 1호
            apt[0][i] = i;  // 0층 i호
        }

        for (int i = 1; i < 15; i++) {  //  14층 까지
            for (int j = 2; j < 15; j++) {  //  호수, 1호는 이미 기본값으로 설정되어 있음
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];   //  한 층 빼고 그 밑에 호수 사람들 더한 값이 해당 층의 사람들
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }
}