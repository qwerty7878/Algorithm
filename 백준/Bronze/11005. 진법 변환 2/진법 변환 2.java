import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        while(n != 0){
            if(n%b >= 10)
                sb.append((char)((n % b) + 55));
            else
                sb.append(n%b);
            n/=b;
        }
        System.out.println(sb.reverse().toString());
    }
}