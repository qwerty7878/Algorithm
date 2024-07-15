import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //  나무 수
        int m = Integer.parseInt(st.nextToken());   //  나무 길이

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);   //  최대값 찾기 위해 정렬

        long max = arr[n - 1];  //  정렬된 배열 맨 마지막값이 최대값
        long min = 1;

        while (min <= max) {
            long mid = (max + min) / 2;  //  이분 탐색을 위한 중간값
            long height = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mid) { //  나뭇가지 길이가 더 길다면
                    height += (arr[i] - mid);   //  잘라내
                }
            }

            if (height < m) {
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