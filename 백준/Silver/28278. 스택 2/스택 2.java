import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int command = sc.nextInt();
            switch(command){
            case 1:
                stack.push(sc.nextInt());
                break;
            case 2:
                sb.append((stack.isEmpty()?-1:stack.pop()) + "\n");
                break;
            case 3:
                sb.append((stack.size()) + "\n");
                break;
            case 4:
                sb.append((stack.isEmpty()?1:0) + "\n");
                break;
            case 5:
                sb.append((stack.isEmpty()?-1:stack.peek()) + "\n");
                break;
            }
        }
            System.out.println(sb);
    }
}