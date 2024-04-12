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


//2번째 방법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	static Integer arr[][] = new Integer [41][2];

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		for(int i = 0; i < t; i++){
			int n = Integer.parseInt(br.readLine());
			fibo(n);
			sb.append(arr[n][0] + " " + arr[n][1]).append('\n');
		}
		System.out.println(sb.toString());
	}

	static Integer[] fibo(int n){
		if(arr[n][0] == null || arr[n][1] == null){
			arr[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
			arr[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
		}
		return arr[n];
	}
}
