import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int crossCount = 1;
        int prevCountSum = 0;

        while (true) {
            if (n <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) {
                    System.out.println(crossCount - (n - prevCountSum - 1) + "/" + (n - prevCountSum));
                    break;
                } else {
                    System.out.println((n - prevCountSum) + "/" + (crossCount - (n - prevCountSum - 1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount += 1;
            }
        }
    }
}