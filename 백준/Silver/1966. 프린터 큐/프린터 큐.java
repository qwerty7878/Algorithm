import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int t = sc.nextInt();

		for(int i = 0; i < t; i++){
			int n = sc.nextInt();
			int m = sc.nextInt();

			LinkedList<int[]> q = new LinkedList<>();

			for(int j = 0; j < n; j++){
				int num = sc.nextInt();
				q.add(new int[] {j,num});
			}

			int cnt = 0;

			while(!q.isEmpty()){
				int front[] = q.poll();
				boolean isMax = true;

				for(int k = 0; k < q.size(); k++){
					if(front[1] < q.get(k)[1]){
						q.add(front);
						for(int j = 0; j < k; j++){
							q.add(q.poll());
						}

						isMax = false;
						break;
					}
				}
				if(isMax == false){
					continue;
				}

				cnt++;
				if(front[0] == m)
					break;
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb.toString());
	}
}