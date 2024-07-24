import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {   //  입력이 0이 주어진 경우
                if (q.isEmpty()) {  //  배열이 비어있다면
                    System.out.println(0);
                } else {    //  최소 힙이니 최소 값 출력
                    System.out.println(q.poll());
                }
            } else {    //  x 라면 배열에 추가하는 연산
                q.add(n);
            }
        }
    }
}