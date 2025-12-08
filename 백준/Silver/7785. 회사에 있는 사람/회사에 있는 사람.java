import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name =  st.nextToken();
            String history =  st.nextToken();

            if (history.equals("enter")) {
                map.put(name, history);
            } else {
                map.remove(name);
            }
        }

        List<String> nameList = new ArrayList<>(map.keySet());
        nameList = nameList.stream().sorted().collect(Collectors.toList());
        for(int i = nameList.size()-1; i >= 0; i--) {
            sb.append(nameList.get(i)).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}