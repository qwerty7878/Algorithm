import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int cnt = 0;
        int start = 0;
        int end = n - 1;

        while(start < end){
            if(arr[start] + arr[end] < m)
                start++;
            else if(arr[start] + arr[end] > m)
                end--;
            else{
                cnt++;
                start++;
                end--;
            }
        }
        System.out.println(cnt);
	}

}