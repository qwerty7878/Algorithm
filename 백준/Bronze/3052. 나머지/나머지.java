import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int [10];
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            h.add(sc.nextInt()%42);
        }
        System.out.println(h.size());
    }
}