import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int score = 0;

            for(int j = 0; j < n; j++){
                String player_A = sc.next();
                String player_B = sc.next();
                
                if(player_A.equals("R") && player_B.equals("S"))
                        score++;
                else if(player_A.equals("R") && player_B.equals("P"))
                        score--;
                else if(player_A.equals("S") && player_B.equals("R"))
                        score--;
                else if(player_A.equals("S") && player_B.equals("P"))
                        score++;
                else if(player_A.equals("P") && player_B.equals("R"))
                        score++;
                else if(player_A.equals("P") && player_B.equals("S"))
                        score--;

            }
            if(score > 0)
                System.out.println("Player 1");
            else if(score < 0)
                System.out.println("Player 2");
            else
                System.out.println("TIE");
        }
    }
}