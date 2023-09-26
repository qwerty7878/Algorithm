import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int score = sc.nextInt();
            if(score >= 97 && score <= 100)
                System.out.println(name + " A+");
            else if(score >= 90 && score <= 96)
                System.out.println(name + " A");
            else if(score >= 87 && score <= 89)
                System.out.println(name + " B+");
            else if(score >= 80 && score <= 86)
                System.out.println(name + " B");
            else if(score >= 77 && score <= 79)
                System.out.println(name + " C+");
            else if(score >= 70 && score <= 76)
                System.out.println(name + " C");
            else if(score >= 67 && score <= 69)
                System.out.println(name + " D+");
            else if(score >= 60 && score <= 66)
                System.out.println(name + " D");
            else if(score >= 0 && score <= 59)
                System.out.println(name + " F");
        }
    }
}