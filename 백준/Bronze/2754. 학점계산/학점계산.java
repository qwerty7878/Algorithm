import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String score = br.readLine();

        if(score.equals("A+")) sb.append(4.3);
        else if(score.equals("A0")) sb.append(4.0);
        else if(score.equals("A-")) sb.append(3.7);
        else if(score.equals("B+")) sb.append(3.3);
        else if(score.equals("B0")) sb.append(3.0);
        else if(score.equals("B-")) sb.append(2.7);
        else if(score.equals("C+")) sb.append(2.3);
        else if(score.equals("C0")) sb.append(2.0);
        else if(score.equals("C-")) sb.append(1.7);
        else if(score.equals("D+")) sb.append(1.3);
        else if(score.equals("D0")) sb.append(1.0);
        else if(score.equals("D-")) sb.append(0.7);
        else sb.append(0.0);

        System.out.println(sb);
    }
}
