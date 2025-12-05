import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int xarr[] = new int[t];
        int yarr[] = new int[t];
        for (int i = 0; i < t; i++) {
            xarr[i] = sc.nextInt();
            yarr[i] = sc.nextInt();
        }
        Arrays.sort(xarr);
        Arrays.sort(yarr);
        
        int xsize = xarr[xarr.length - 1] - xarr[0];
        int ysize = yarr[yarr.length - 1] - yarr[0];

        System.out.println(xsize * ysize);
    }
}