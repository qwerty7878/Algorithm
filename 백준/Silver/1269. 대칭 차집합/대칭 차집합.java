import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());

        Set<Integer> a = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            b.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        a.removeAll(intersection);
        b.removeAll(intersection);

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        StringBuilder sb = new StringBuilder();
        sb.append(union.size());

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}