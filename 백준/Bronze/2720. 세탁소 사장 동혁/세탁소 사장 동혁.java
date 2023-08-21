import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int  i = 0; i < T; i++){
            int cost = sc.nextInt();
            int quarter = cost/25;
            int dime = (cost - quarter * 25)/10;
            int nickel = (cost - quarter *25 - dime * 10)/5;
            int penny = cost - quarter * 25 - dime * 10 - nickel * 5;
            
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}