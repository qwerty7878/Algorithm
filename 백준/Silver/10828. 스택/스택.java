import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String s = sc.next();

            if(s.equals("push"))
                stack.push(sc.nextInt());
            else if(s.equals("pop"))
                sb.append((stack.isEmpty()?-1:stack.pop()) + "\n");
            else if(s.equals("size"))
                sb.append((stack.size()) + "\n");
            else if(s.equals("empty"))
                sb.append((stack.isEmpty()?1:0) + "\n");
            else if(s.equals("top"))
                sb.append((stack.isEmpty()?-1:stack.peek()) + "\n");
        }
        System.out.println(sb);
    }
}