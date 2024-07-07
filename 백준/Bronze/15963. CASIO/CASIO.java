import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        if (n == m) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}