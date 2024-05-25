import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arr[] = new int[5];
        long sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += Math.pow(arr[i], 2);
        }
        System.out.println(sum % 10);
    }
}