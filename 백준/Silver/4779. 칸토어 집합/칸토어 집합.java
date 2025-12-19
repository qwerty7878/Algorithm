import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                int n = Integer.parseInt(br.readLine());
                System.out.println(cantor(n));
            }catch (Exception e){
                break;
            }
        }
    }

    private static String cantor(int n) {
        if (n == 0) {
            return "-";
        } else {
            String prev = cantor(n - 1);
            return prev + " ".repeat(prev.length()) + prev;
        }
    }
}