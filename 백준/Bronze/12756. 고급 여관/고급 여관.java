import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int atk_a = sc.nextInt();
        int life_a = sc.nextInt();

        int atk_b = sc.nextInt();
        int life_b = sc.nextInt();

        while(true){
            life_a -= atk_b;
            life_b -= atk_a;

            if(life_a <= 0 && life_b >= 1){
                System.out.println("PLAYER B");
                break;
            }
            else if(life_a >= 1 && life_b <= 0){
                System.out.println("PLAYER A");
                break;
            }
            else if(life_a <= 0 && life_b <= 0){
                System.out.println("DRAW");
                break;
            }
            else
                continue;

        }
        sc.close();
    }
}