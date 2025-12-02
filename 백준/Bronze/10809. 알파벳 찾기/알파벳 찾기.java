import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int alpha[] = new int[26];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (alpha[s.charAt(i) - 'a'] == -1) {
                alpha[s.charAt(i) - 'a'] = i;
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}