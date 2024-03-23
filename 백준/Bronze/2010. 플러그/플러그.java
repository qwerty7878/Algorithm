import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plug = sc.nextInt();
        int Max_com = 1;
        for(int i = 0; i < plug; i++){
            int line = sc.nextInt();
            Max_com += line;
        }
        Max_com -= plug;
        System.out.println(Max_com);
    }
}