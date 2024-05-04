import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int num;
            if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C')
            num = 2;
            else if (s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F')
                num = 3;
            else if (s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I')
                num = 4;
            else if (s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L')
                num = 5;
            else if (s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O')
                num = 6;
            else if (s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S')
                num = 7;
            else if (s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V')
                num = 8;
            else if (s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z')
                num = 9;

            else num = 1;

            sum += num;
        }

        System.out.println(sum + s.length());
        sc.close();
    }
}