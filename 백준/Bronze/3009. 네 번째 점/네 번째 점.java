import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrx[] = new int[3];
        int arry[] = new int[3];
        int fx = 0;
        int fy = 0;
        for(int i = 0; i < 3; i++){
            arrx[i] = sc.nextInt();
            arry[i] = sc.nextInt();
        }

        if(arrx[0] == arrx[1])
            fx = arrx[2];
        else if(arrx[0] == arrx[2])
            fx = arrx[1];
        else
            fx = arrx[0];

        if(arry[0] == arry[1])
            fy = arry[2];
        else if(arry[0] == arry[2])
            fy = arry[1];
        else
            fy = arry[0];

        System.out.println(fx + " " + fy);
    }
}