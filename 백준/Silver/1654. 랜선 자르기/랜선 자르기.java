import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());   //  보유한 랜선 갯수
        int n = Integer.parseInt(st.nextToken());   //  필요한 랜선 갯수

        int arr[] = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);   //  최대값 찾기 위해 정렬

        long max = arr[k - 1];  //  정렬된 배열 맨 마지막값이 최대값
        long min = 1;
        long mid;
        long cnt;

        while (min <= max) {
            mid = (max + min) / 2;  //  이분 탐색을 위한 중간값
            cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < n) {
                //  예상치보다 적다면 분모값을 늘려야한다
                //  분모인 mid의 크기를 작게해야한다
                //  작게하려면 mid에서 max값을 줄인다
                max = mid - 1;
            } else {
                //  예상치보다 크다면 분모값을 줄여야한다
                //  분모인 mid의 크기를 크게해야한다
                //  크게하려면 mid에서 min값을 줄인다
                min = mid + 1;
            }
        }
        System.out.println(max);
    }
}