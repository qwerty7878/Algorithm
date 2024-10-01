import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            String day = sc.next();

            int ans = 0;
            if(day.equals("MON")){
                ans = 6;
            }
            if(day.equals("TUE")){
                ans = 5;
            }
            if(day.equals("WED")){
                ans = 4;
            }
            if(day.equals("THU")){
                ans = 3;
            }
            if(day.equals("FRI")){
                ans = 2;
            }
            if(day.equals("SAT")){
                ans = 1;
            }
            if(day.equals("SUN")){
                ans = 7;
            }
            System.out.printf("#%d %d\n", tc + 1, ans);
        }
    }
}