import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = n; i <= m; i++) {
            for(int j = 2; j <= i; j++){
                if(i == j) {
                    list.add(i);
                }
                if(i % j == 0) break;
            }
        }

        int arr[] = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
            sum += arr[i];
        }

        if(list.isEmpty()) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(arr[0]);
        }
    }
}