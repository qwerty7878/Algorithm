import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            System.out.println((s.charAt(0) + "").toUpperCase() + s.substring(1,s.length()));
        }
    }
}