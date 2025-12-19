import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
//        첫째 줄에는 산술평균을 출력한다
        int total = (int) Math.round((double) Arrays.stream(arr).sum() / arr.length);
        sb.append(total).append("\n");

//        둘째 줄에는 중앙값을 출력한다.
        sb.append(arr[arr.length / 2]).append("\n");

//        셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
        Map<Integer, Integer> mostNumbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mostNumbers.put(arr[i], mostNumbers.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(mostNumbers.keySet());
        list.sort((o1, o2) -> {
            int count1 =  mostNumbers.get(o1);
            int count2 = mostNumbers.get(o2);

//            작은 순으로 정렬(최빈값 2번쨰가 2번째에 있도록 하기 위해)
            if (count1 != count2) {
                return count2 - count1;
            }
//            전체 오름차순
            return o1 - o2;
        });

        if (list.size() > 2 && mostNumbers.get(list.get(1)) == mostNumbers.get(list.get(0))) {
            sb.append(list.get(1)).append("\n");
        } else {
            sb.append(list.get(0)).append("\n");
        }

//        넷째 줄에는 범위를 출력한다.
        int max = arr[arr.length - 1];
        int min = arr[0];
        sb.append(max - min).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}