import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //과목갯수
        double arr[] = new double [n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        double sum = 0;
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            sum += ((arr[i]/arr[arr.length-1])*100);
        }
        System.out.print(sum/arr.length);
    }
}