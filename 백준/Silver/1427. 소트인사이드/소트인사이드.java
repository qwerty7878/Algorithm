import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        String s = "" + n;
        String arr[] = s.split("");

        Arrays.sort(arr);

        for(int i = arr.length-1; i >= 0; i--){
            sb.append(Long.parseLong(arr[i]));
        }

        bw.write(sb.toString());
        bw.flush();
    }
}