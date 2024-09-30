import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++){
            String num = sc.next();
            int arr[] = new int[10];

            for(int i = 0; i < num.length(); i++){
                if(arr[num.charAt(i) - '0'] == 0){
                    arr[num.charAt(i) - '0']++;
                }
            }

            int cnt = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 1){
                    cnt++;
                }
            }
            System.out.printf("#%d %d\n",tc+1, cnt);
        }
    }
}