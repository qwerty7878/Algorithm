import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = N;
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			boolean pn = true;
			if(i == 1) pn = false;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					pn = false;
					break;
				}
			}
			
			if(pn) {
				if(min > i) min = i;
				sum += i;
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
	}
}