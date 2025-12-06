import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        값 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

//        보드 판 선언
        char board[][] = new char[n][m];

//        값 할당
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
//        전체 판에서 8 * 8판 씩 순회
        for (int x = 0; x < n - 7; x++) {
            for (int y = 0; y < m - 7; y++) {

                int bcount = 0;
                int wcount = 0;

//                8 * 8 범위 안에서 조회
                for (int i = x; i < x + 8; i++) {
                    for (int j = y; j < y + 8; j++) {
//                        짝수인 경우
                        if ((i + j) % 2 == 0) {
//                            w b w b w b w 라는 가정하에
                            if (board[i][j] != 'B') {
                                bcount++;
//                                b w b w b w 여야함
                            } if (board[i][j] != 'W') {
                                wcount++;
                            }
                        }
//                        홀수인 경우
                        else {
//                            w b w b w b w b
                            if (board[i][j] != 'W') {
                                bcount++;
                            } if (board[i][j] != 'B') {
                                wcount++;
                            }
                        }
                    }
                }
                min = Math.min(min, Math.min(bcount, wcount));
            }
        }
        System.out.println(min);
    }
}