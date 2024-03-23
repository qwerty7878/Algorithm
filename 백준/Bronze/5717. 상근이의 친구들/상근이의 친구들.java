import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int sum = 0;
            int boys = sc.nextInt();
            int girls = sc.nextInt();
            
            if(boys == 0 && girls == 0)
                break;
            
            sum = boys + girls;
            System.out.println(sum);
        }
        sc.close();
    }
}