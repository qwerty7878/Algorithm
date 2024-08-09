import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int bluecnt = 0;
    static int whitecnt = 0;
    static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];    //  정사각형이므로 2차원배열

        for (int i = 0; i < n; i++) {   //  2차원 배열에 값 할당
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);    //  처음 0,0을 기준으로 체크
        System.out.println(whitecnt);
        System.out.println(bluecnt);
    }

    static void divide(int x, int y, int size) {

        if (colorcheck(x, y, size)) {
            if (arr[x][y] == 0) {   //  흰색은 0 파란색은 1로 재귀를 통해 설정
                whitecnt++;
            } else {
                bluecnt++;
            }
            return;
        }

        int newsize = size / 2; //  반으로 쪼개서 다른 색이 있는지 확인하기위해
        divide(x + newsize,y,newsize); //  1사분면은 2사분면보다 x가 더 멀리있음
        divide(x,y,newsize); //  2사분면이 기준임
        divide(x,y + newsize,newsize); //  3사분면은 2사분면보다 y가 더 멀리있음
        divide(x + newsize,y + newsize,newsize); //  4사분면 2사분면보다 x,y가 더 멀리있음
    }

    static boolean colorcheck(int x, int y, int size) {
        int color = arr[x][y];

        for (int i = x; i < x + size; i++) {    //  전부 같은 색인지를 확인하기 위한 반복문
            for (int j = y; j < y + size; j++) {
                if (color != arr[i][j]) {       //  false라면 다른색이 존재하므로 더 쪼개야함
                    return false;
                }
            }
        }
        return true;
    }
}
