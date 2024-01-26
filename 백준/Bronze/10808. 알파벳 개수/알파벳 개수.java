import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int arr[] = new int [26];
			String s = sc.next();

			for(int i = 0; i < s.length(); i++){
				arr[s.charAt(i) - 97]++; 
			}
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
		}
	}