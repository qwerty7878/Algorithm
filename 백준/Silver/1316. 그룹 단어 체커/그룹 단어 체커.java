import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n;

        for(int i = 0; i < n; i++){
            int alpha[] = new int[26];
            String s = sc.next();
            int prev = 0;

            for(int j = 0; j < s.length(); j++){
                if(prev != s.charAt(j)){
                    if(alpha[s.charAt(j) - 'a'] == 0){
                        alpha[s.charAt(j) - 'a']++;
                        prev = s.charAt(j);
                    }
                    else {
                        cnt--;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}