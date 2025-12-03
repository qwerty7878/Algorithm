import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double gradeSum = 0;
        double gradeTotal = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("A+")) {
                gradeSum += score * 4.5;
                gradeTotal += score;
            }else if (grade.equals("A0")) {
                gradeSum += score * 4.0;
                gradeTotal += score;
            }else if (grade.equals("B+")) {
                gradeSum += score * 3.5;
                gradeTotal += score;
            }else if (grade.equals("B0")) {
                gradeSum += score * 3.0;
                gradeTotal += score;
            }else if (grade.equals("C+")) {
                gradeSum += score * 2.5;
                gradeTotal += score;
            }else if (grade.equals("C0")) {
                gradeSum += score * 2.0;
                gradeTotal += score;
            }else if (grade.equals("D+")) {
                gradeSum += score * 1.5;
                gradeTotal += score;
            }else if (grade.equals("D0")) {
                gradeSum += score * 1.0;
                gradeTotal += score;
            }else if (grade.equals("F")) {
                gradeSum += score * 0.0;
                gradeTotal += score;
            }else if (grade.equals("P")) {
                continue;
            }
        }
        System.out.printf("%.6f", gradeSum /  gradeTotal);
    }
}