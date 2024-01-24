import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.nextLine();

            if(s.equals("#"))
                break;
            
            String[] arr = s.toLowerCase().split("");
            int cnt = 0;
            for(int i = 0; i < arr.length; i++){
                if(s.split(" ")[0].equals(arr[i]))
                    cnt++;
            }
            System.out.println(s.split(" ")[0] + " " + (cnt - 1));
        }
        }
    }