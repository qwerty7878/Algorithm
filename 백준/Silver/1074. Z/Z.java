import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        visit(r, c, (int) Math.pow(2, n));
        System.out.println(cnt);
    }

    static void visit(int x, int y, int size) {
        if (size == 1) {
            return;
        }
        if (x < size / 2 && y < size / 2) {
            visit(x,y,size/2);
        } else if (x < size /2 && y >= size / 2) {
            visit(x,y - size/2 , size/2);
            cnt += (size * size)/4;
        } else if (x >= size / 2 && y < size / 2) {
            visit(x - size / 2, y, size / 2);
            cnt += (size * size)/4 * 2;
        } else {
            visit(x - size/2, y - size/2, size/2);
            cnt += (size * size)/4 * 3;
        }
    }
}