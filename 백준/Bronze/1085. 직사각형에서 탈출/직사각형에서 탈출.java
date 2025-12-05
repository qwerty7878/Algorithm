import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(Math.abs(w - x));
        list.add(Math.abs(h - y));

        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);
    }
}