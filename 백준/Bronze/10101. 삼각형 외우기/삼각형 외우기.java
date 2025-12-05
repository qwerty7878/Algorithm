import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> angles =  new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int angle = sc.nextInt();
            angles.add(angle);
        }

        int sum = angles.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Set<Integer> set = new HashSet<>(angles);
        
        if  (set.size() == 1 && sum == 180) {
            System.out.println("Equilateral");
        }else if (set.size() == 2 && sum == 180) {
            System.out.println("Isosceles");
        }else if (set.size() == 3 && sum == 180) {
            System.out.println("Scalene");
        } else if (sum != 180) {
            System.out.println("Error");
        }
    }
}