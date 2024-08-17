import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //given
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[26];
        int max = 0;
        int num = 9;
        //when
        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                arr[s.charAt(j) - 'A'] += Math.pow(10, s.length() - j - 1);
            }
        }

        Arrays.sort(arr);

        for (int i = 25; i >= 0; i--) {
            if (arr[i] == 0) {
                continue;
            }
            max += arr[i] * num;
            num--;
        }
        //then
        System.out.println(max);
    }
}