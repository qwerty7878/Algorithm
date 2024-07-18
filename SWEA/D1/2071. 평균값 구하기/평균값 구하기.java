import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int arr[] = new int[10];

        for(int i = 0; i < t; i++){
            double sum = 0;
            for(int j = 0; j < arr.length; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            System.out.println("#" + (i+1) + " " + Math.round(sum/10));
        }
    }
}