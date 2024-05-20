import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();

            if(n == -1) break;

            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    list.add(i);
                    sum += i;
                }
            }

            if(sum == n){
                sb.append(n).append(" = ");
                for(int i = 0; i < list.size(); i++){
                    if(i != list.size() -1)
                        sb.append(list.get(i)).append(" + ");
                    else
                        sb.append(list.get(i));
                }
            } else
                sb.append(n).append(" is NOT perfect.");

            System.out.println(sb);
        }
    }
}