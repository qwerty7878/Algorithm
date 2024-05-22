import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrx[] = new int[n];
        int arry[] = new int[n];

        for(int i = 0; i < n; i++){
            arrx[i] = sc.nextInt();
            arry[i] = sc.nextInt();
        }
        Arrays.sort(arrx);
        Arrays.sort(arry);

        int maxx = arrx[n -1];
        int maxy = arry[n -1];
        int minx = arrx[0];
        int miny = arry[0];

        System.out.println((maxx - minx) * (maxy - miny));
    }
}