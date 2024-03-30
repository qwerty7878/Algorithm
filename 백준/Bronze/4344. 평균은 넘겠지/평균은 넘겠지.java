import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int score[];

		for(int i = 0; i < n; i++){

			int student = sc.nextInt();
			score = new int [student];

			double sum = 0;

			for(int j = 0; j < student; j++){
				score[j] = sc.nextInt();
				sum += score[j];
			}

			double avg = (sum/student);
			double cnt = 0;

			for(int j = 0; j < student; j++){
				if(score[j] > avg)
					cnt++;
			}

			System.out.printf("%.3f%%\n",(cnt/student)*100);
		}
	}
}