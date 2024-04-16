import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		System.out.println((n * m) / gcd(n,m));
	}
	public static long gcd(long a,long b){ // 유클리드 호제법
		while(b > 0){
			long temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}

}