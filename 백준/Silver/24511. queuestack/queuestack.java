import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> dq = new ArrayDeque<>();

		int n = Integer.parseInt(br.readLine()); // 갯수
		int arr[] = new int [n]; // 객수 n 인 배열 생성

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++){ // n 크기 배열에 스택인지 팝인지 값 할당
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(st.nextToken()); // 수열 B 값 할당
			if(arr[i] == 0) // 큐는 FIFO
				dq.addLast(num);
		}

		int m = Integer.parseInt(br.readLine()); // 삽입할 수열 길이
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++){ 	// 삽입할 값 할당
			dq.addFirst(Integer.parseInt(st.nextToken()));
			bw.write(dq.pollLast() + " ");
		}
		bw.flush();
	}
}