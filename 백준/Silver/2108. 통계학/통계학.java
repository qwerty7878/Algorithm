import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int cnt = 0;
        int max = -1;   //  cnt가 0이 존재하므로
        boolean check = false;
        int mod = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (max < cnt) {
                max = cnt;  //  최댓값 변경
                mod = arr[i];   //  최빈값 설정
                check = true;   //  두번째 최빈값임을 보여주기 위해 사용
            } else if (max == cnt && check == true) {
                mod = arr[i];   //   check가 true라는 것은 max 값이 더 크지 않다는 것, max == cnt 는 두번째 값이 됨
                check = false;
            }
        }

        System.out.println(Math.round(sum/n));
        System.out.println(arr[n/2]);
        System.out.println(mod);
        System.out.println(arr[n-1] - arr[0]);
    }
}