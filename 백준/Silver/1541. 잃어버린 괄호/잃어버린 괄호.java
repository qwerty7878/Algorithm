import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String sub_arr[] = s.split("-");
        int answer = Integer.MAX_VALUE;
        //  최댓값을 초기값으로 저장
        //  최댓값일 경우와 아닌 경우로 조건을 주기 위해서

        for (int i = 0; i < sub_arr.length; i++) {
            int sum = 0;
            String add_arr[] = sub_arr[i].split("\\+");

            for (int j = 0; j < add_arr.length; j++) {
                sum += Integer.parseInt(add_arr[j]);
            }

            if (answer == Integer.MAX_VALUE) {  //  초기값인 경우
                answer = sum;   //  첫번째 값 설정
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}