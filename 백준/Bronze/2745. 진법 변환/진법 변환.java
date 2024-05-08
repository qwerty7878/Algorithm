import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        int sum = 0;
        int pow = 1;

        for(int i = s.length() -1; i  >= 0; i--){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'z')
                sum += (c - 'A' + 10) * pow;
            else
                sum += (c - '0') * pow;

            pow *= n;
        }
        System.out.println(sum);
        sc.close();
    }
}