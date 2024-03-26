import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int arr[] = new int [10]; // 0~9

        for(char c : n.toCharArray()){
            int num = c - '0';
            if(num == 9)
                num = 6;
            
            arr[num]++;
        }
        arr[6] = arr[6]/2 + arr[6]%2; // 6,9니까
        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}