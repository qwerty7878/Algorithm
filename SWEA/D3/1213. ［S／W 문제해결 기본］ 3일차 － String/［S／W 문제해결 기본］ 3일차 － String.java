import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int testnum = sc.nextInt();
            String find = sc.next();
            String ques = sc.next();

            int cnt = 0;

            for (int i = 0; i <= ques.length() - find.length(); i++) {
                String word = ques.substring(i, find.length() + i);

                if (word.equals(find)) {
                    cnt++;
                }
            }

            System.out.printf("#%d %d\n", testnum, cnt);
        }
    }
}