import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int hun = b / 100;
        int ten = (b % 100) / 10;
        int one = (b % 100) % 10;

        System.out.println(a * one);
        System.out.println(a * ten);
        System.out.println(a * hun);
        System.out.println(a * b);
    }
}