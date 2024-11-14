import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            String memory = sc.next();
            char before = '0';
            int answer = 0;
            for (int i = 0; i < memory.length(); i++) {
                if (memory.charAt(i) != before) {
                    before = memory.charAt(i);
                    answer++;
                }
            }
            System.out.printf("#%d %d\n",test,answer);
        }
    }
}
