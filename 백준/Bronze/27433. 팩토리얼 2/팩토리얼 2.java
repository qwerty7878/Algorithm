//반복문
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
//재귀
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    static long factorial(int n){
        if(n <= 0){
            return 1;
        }
        
        return n*factorial(n-1);
    }
}
