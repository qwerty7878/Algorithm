import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //  뜯긴 줄
        int m = Integer.parseInt(st.nextToken());   //  브랜드

        int one = Integer.MAX_VALUE;
        int six = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            six = Math.min(six, Integer.parseInt(st.nextToken()));
            one = Math.min(one, Integer.parseInt(st.nextToken()));
        }

        int cost = 0;
        if ((one * 6) < six) {    //  낱개가 더 쌈
            cost = one * n;
        } else {    //  패키지가 더 쌈
            cost = six * (n / 6);   //  패키지 낱개 가격
            cost += Math.min(n % 6 * one, six);   //  n개의 나머지와 패키지 1개 가격비교
        }
        System.out.println(cost);
    }
}