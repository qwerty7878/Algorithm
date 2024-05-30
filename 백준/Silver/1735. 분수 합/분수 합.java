import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int mom = b * d;
        int son = (a * d) + (b * c);

        int divide = gcd(son, mom);
        mom /= divide;
        son /= divide;
        System.out.println(son + " " + mom);
    }

   public static int gcd(int n, int m){
        if(m == 0)  return n;
        return gcd(m, n % m);
   }
}
