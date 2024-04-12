import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		long arr[] = new long [41];
		arr[1] = 1;

		for(int i = 2; i < 41; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}

		for(int i = 0; i < t; i++){
			int n = Integer.parseInt(br.readLine());
			if(n == 0){
				sb.append("1 0").append('\n');
				continue;
			}
			sb.append(arr[n-1] + " " + arr[n]).append('\n');
		}
		System.out.println(sb.toString());
	}
}