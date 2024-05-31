import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int arr[] = new int[8];
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j - 1] + 1 == arr[j]) {
                res = "ascending";
            } else if (arr[j - 1] - 1 == arr[j]) {
                res = "descending";
            } else {
                res = "mixed";
                break;
            }
        }
        System.out.println(res);
    }
}
