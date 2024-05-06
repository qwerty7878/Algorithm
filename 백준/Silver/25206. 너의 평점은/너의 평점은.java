import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double majorSum = 0;
        double scoreSum = 0;

        for(int i = 0; i < 20; i++){
            String major = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            if(grade.equals("P"))   continue;
            else{
                if(grade.equals("A+")){
                    scoreSum += score;
                    majorSum += score * 4.5;
                }
                else if(grade.equals("A0")){
                    scoreSum += score;
                    majorSum += score * 4.0;
                }
                else if(grade.equals("B+")){
                    scoreSum += score;
                    majorSum += score * 3.5;
                }
                else if(grade.equals("B0")){
                    scoreSum += score;
                    majorSum += score * 3.0;
                }
                else if(grade.equals("C+")){
                    scoreSum += score;
                    majorSum += score * 2.5;
                }
                else if(grade.equals("C0")){
                    scoreSum += score;
                    majorSum += score * 2.0;
                }
                else if(grade.equals("D+")){
                    scoreSum += score;
                    majorSum += score * 1.5;
                }
                else if(grade.equals("D0")){
                    scoreSum += score;
                    majorSum += score * 1.0;
                }
                else if(grade.equals("F")){
                    scoreSum += score;
                    majorSum += score * 0.0;
                }
            }
        }
        System.out.println(majorSum / scoreSum);
    }
}

