import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<String> map = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String isWork = st.nextToken();
            if (isWork.equals("enter")) {
                map.add(name);
            } else {
                map.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<String>(map);
        Collections.sort(list,Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
