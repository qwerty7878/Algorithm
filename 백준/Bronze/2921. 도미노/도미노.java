import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        int dot = 0;
        for(int i = 0; i <= set; i++){
            for(int j = i; j <= set; j++){
                dot += (i + j);
            }
        }
        System.out.println(dot);
    }
}