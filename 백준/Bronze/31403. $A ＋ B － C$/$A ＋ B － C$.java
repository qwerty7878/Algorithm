import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(a + b - c);

        String Sa = "" + a;
        String Sb = "" + b;
        String Scc = "" + c;

        int res = Integer.parseInt(Sa + Sb);
        int resC = Integer.parseInt(Scc);
        System.out.println(res - resC);
    }
}