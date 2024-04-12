import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static long arr[];

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new long [n + 1];

		for(int i = 0; i < n + 1; i++){
			arr[i] = -1;
		}
		arr[0] = 0;
		arr[1] = 1;	
		System.out.println(fibo(n));
	}

	public static long fibo(int n) {
		if(arr[n] == -1){
			arr[n] = fibo(n - 1) + fibo(n - 2);
		}
		return arr[n];
	}
}