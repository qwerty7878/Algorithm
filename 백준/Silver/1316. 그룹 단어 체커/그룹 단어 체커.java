import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        int count = 0;
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            List<Character> list = new ArrayList<>();
            boolean isGroupWord = false;

            for (int j = 0; j < s.length(); j++) {
                if (!list.contains(s.charAt(j))) {
                    list.add(s.charAt(j));
                } else if (list.contains(s.charAt(j)) && !(list.get(list.size() - 1).equals(s.charAt(j))))  {
                    isGroupWord = true;
                    break;
                }
            }

            if (!isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}