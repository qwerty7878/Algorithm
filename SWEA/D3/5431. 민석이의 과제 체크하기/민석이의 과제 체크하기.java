import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < a; i++) {
                list.add(i + 1);
            }

            for (int i = 0; i < b; i++) {
                int num = sc.nextInt();
                list.remove(Integer.valueOf(num));
            }
            Collections.sort(list);

            System.out.print("#" + (tc + 1) + " ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}