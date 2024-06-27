import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a > b)	System.out.println("#" + (i + 1) + " " + ">");
            else if(a == b) System.out.println("#" + (i + 1) + " " + "=");
            else System.out.println("#" + (i + 1) + " " + "<");
        }
	}
}