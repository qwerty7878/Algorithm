import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();

        int not_Kawai_result = 0;
        int Kawai_result = 0;
        
        for(int i = 0; i < person; i++){
            int optinion = sc.nextInt();
            if(optinion == 0)
                not_Kawai_result++;
            else
                Kawai_result++;
        }

        if(Kawai_result > not_Kawai_result)
            System.out.println("Junhee is cute!");
        else
            System.out.println("Junhee is not cute!");
        
    }
}