import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next()
                .replace("c=","0")
                .replace("c-","0")
                .replace("dz=","0")
                .replace("d-","0")
                .replace("lj","0")
                .replace("nj","0")
                .replace("s=","0")
                .replace("z=","0");

        String sAr[] = s.split("");
        System.out.println(sAr.length);

        sc.close();
    }
}