import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [3];

		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		String s = sc.next();
		Arrays.sort(arr);

		for(int i = 0; i < arr.length; i++){
			if(s.charAt(i) == 'A')
				System.out.print(arr[0] + " ");
			else if(s.charAt(i) == 'B')
				System.out.print(arr[1] + " ");
			else if(s.charAt(i) == 'C')
				System.out.print(arr[2] + " ");
		}
	}
}