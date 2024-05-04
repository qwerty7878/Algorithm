import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        String revA = sb.append(a).reverse().toString();
//        sb.setLength(0);
        sb = new StringBuilder();
        String revB = sb.append(b).reverse().toString();

        int nA = Integer.valueOf(revA);
        int nB = Integer.valueOf(revB);

        if(nA > nB) System.out.println(nA);
        else System.out.println(nB);

        sc.close();
    }
}
