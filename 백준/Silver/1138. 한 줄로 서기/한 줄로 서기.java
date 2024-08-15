import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //given
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[n + 1];

        //when
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n; i >= 1; i--) {
            list.add(arr[i],i); //   i번째에   arr[i]를 더함
        }

        //then
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}