import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());    //  테스트케이스

        while (t --> 0){    //  테스트 케이스 갯수만큼 반복
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());   //  문서 갯수
            int m = Integer.parseInt(st.nextToken());   //  몇번째에 놓을지

            LinkedList<int []> q = new LinkedList<>();  //  인덱스 값을 사용하기 위해 배열을 사용

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                q.add(new int[]{i, Integer.parseInt(st.nextToken())});  //  중요도
            }

            int cnt = 0;
            while (!q.isEmpty()) {  //  한 테스트 케이스 확인

                int temp[] = q.poll();
                boolean isMax = true;
                // 최대값 초기값 설정

                for (int i = 0; i < q.size(); i++) {
                    if (temp[1] < q.get(i)[1]) {
                        //  현재 max값보다 큰 값이면 현재값은 q에 추가
                        q.add(temp);
                        for (int j = 0; j < i; j++) {
                            q.add(q.poll());    //  최대값 찾기
                        }

                        isMax = false;  //  최대값일때 정지
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                cnt++;
                if (temp[0] == m) { //  인덱스 값과 중요도가 같다면 정지
                    break;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}