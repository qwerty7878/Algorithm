import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static char star[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        star = new char[n][n];

//        공백으로 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ' ';
            }
        }

        makeStar(0, 0, n);

//        결과 저장
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(star[i][j]);
            }
            sb.append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void makeStar(int x, int y, int n) {
//        1이면 *
        if (n == 1) {
            star[x][y] = '*';
            return;
        }

        int newSize = n / 3;
//        27 -> 9 -> 3으로 줄여나가야함
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                가운데라면 공백들어가야함
                if (i == 1 && j == 1) {
                    continue;
//                    아니라면 별찍기
                } else {
                    makeStar(x + newSize * i, y + newSize * j, newSize);
                }
            }
        }
    }
}