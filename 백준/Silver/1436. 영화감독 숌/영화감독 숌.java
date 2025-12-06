import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int movieNum = 665;
        while (true) {
            String movieName = Integer.toString(movieNum);
            if (movieName.contains("666")) {
                n -= 1;
                if (n == 0) {
                    System.out.println(movieNum);
                    break;
                }
            }
            movieNum++;
        }
    }
}