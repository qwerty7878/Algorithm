import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.contains("c=")) {
            input = input.replace("c=", "@");
        }
        if (input.contains("c-")) {
            input = input.replace("c-", "@");
        }
        if (input.contains("dz=")) {
            input = input.replace("dz=", "@");
        }
        if (input.contains("d-")) {
            input = input.replace("d-", "@");
        }
        if (input.contains("lj")) {
            input = input.replace("lj", "@");
        }
        if (input.contains("nj")) {
            input = input.replace("nj", "@");
        }
        if (input.contains("s=")) {
            input = input.replace("s=", "@");
        }
        if (input.contains("z=")) {
            input = input.replace("z=", "@");
        }
        System.out.println(input.length());
    }
}