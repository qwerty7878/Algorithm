import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Main
 */
class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            sb.append("#" + (i + 1) + " ");
            for(int j = 0; j < n - 1; j++){
                sb.append(arr[j] + " ");
            }
            sb.append(arr[n - 1] + "\n");
        }
        
        System.out.println(sb.toString());
    }
}