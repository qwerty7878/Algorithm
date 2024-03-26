import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int k = sc.nextInt();

        for(int i = 0; i < k; i++){
            int n = sc.nextInt();

            if(n == 0)
                stack.pop();
            else
                stack.push(n);
        }
        long sum = 0;

        for(int j:stack){
            sum += j;
        }

        System.out.println(sum);
    }
}