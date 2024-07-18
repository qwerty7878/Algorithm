import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[301];
        int score[] = new int[301];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //  초기 값
        score[1] = arr[1];
        score[2] = arr[1] + arr[2];
        score[3] = Math.max(arr[2] + arr[3], arr[1] + arr[3]);

        for (int i = 4; i <= n; i++) {
            // 2계단 밟고 본인에게 도착, 한 계단 밟고 본인에게 도착(그 전엔 반드시 2계단이여야함)
            score[i] = Math.max(score[i - 2] + arr[i], score[i - 3] + arr[i - 1] + arr[i]);
        }
        System.out.println(score[n]);
    }
}