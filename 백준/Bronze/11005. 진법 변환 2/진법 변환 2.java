import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int b = sc.nextInt();

        while (n > 0){
            if(n % b >= 10)
                sb.append((char) ((n % b) - 10 + 'A'));
            else
                sb.append(n % b);
            n /=b;
        }
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}