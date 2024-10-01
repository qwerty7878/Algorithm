import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            int n = sc.nextInt();

            System.out.print("#" + (tc + 1) + " ");
            for(int i = 0; i < n; i++){
                System.out.print("1/" + n + " ");
            }
            System.out.println();
        }
    }
}