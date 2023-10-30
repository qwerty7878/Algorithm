import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [9];
        int sum = 0;
        int spy1 = 0; int spy2 = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            sum += arr[i]; //1~9번쨰 애들 키 다 더해져 있음
        }
        Arrays.sort(arr); //키 순으로(오름차순)

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(sum-arr[i]-arr[j] == 100){
                //sum - i번쨰 난쟁이 - j번쨰 난쟁이로 반복하면서 범인찾기
                    spy1 = i;
                    spy2 = j;
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(i == spy1 || i == spy2)
                continue; // 범인들은 건너뛰기
            System.out.println(arr[i]);
        }
    }
}