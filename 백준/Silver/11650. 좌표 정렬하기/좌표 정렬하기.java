import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];

        for(int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //람다식 사용
        Arrays.sort(arr,(arr1,arr2) -> {    //arr1 과 arr2 는 arr[i][0]와 arr[i + 1][0]과 동일
            if(arr1[0] == arr2[0])  return arr1[1] - arr2[1];
            else return arr1[0] - arr2[0];
        });

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}