import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                stack.push((double) arr[s.charAt(i) - 'A']);
            } else {
                if (s.charAt(i) == '+') {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    double num3 = num2 + num1;
                    stack.push(num3);
                }
                else if (s.charAt(i) == '-') {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    double num3 = num2 - num1;
                    stack.push(num3);
                }
                else if (s.charAt(i) == '*') {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    double num3 = num2 * num1;
                    stack.push(num3);
                }
                else if (s.charAt(i) == '/') {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    double num3 = num2 / num1;
                    stack.push(num3);
                }
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}