import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {   //  듣도 못한 사람
            set.add(br.readLine());
        }

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < m; i++) {   // 보도 못한 사람
            String s = br.readLine();
            if (set.contains(s)) {  //  듣보잡
                list.add(s);
            }
        }
        Collections.sort(list);

        String arr[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        StringBuilder sb = new StringBuilder();

        sb.append(list.size()).append("\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}