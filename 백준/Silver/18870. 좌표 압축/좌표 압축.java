import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int rank[] = arr.clone();
        //  값에 대한 순위 피악을 위헤 정렬이 필요함
        //  정렬을 처음 배열에서 하면 결과값이 달라지기 때문에 복사된 배열을 하나 만듬
        Arrays.sort(rank);

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(rank[i])) {   //  인덱스 중복방지
                hm.put(rank[i], index); //  값, 순위
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(hm.get(arr[i])).append(" ");
        }

        System.out.println(sb.toString());
    }
}