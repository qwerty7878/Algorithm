import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int consonant = 0;
        int vowel = 0;
        for(int i = 0; i <= n; i++){
            String t = sc.nextLine().toLowerCase().trim().replace(" ","");
            //입력 후 소문자 변환, 공백 삭제, 띄어쓰기 제거
            //enter를 치면서 내려가야하니까 line을 써줘야함 띄어쓰기가 되어있는 상태라 단순 sc.next는 안됨
            for(int j = 0; j < t.length(); j++){
                if(t.charAt(j) == 'a' || t.charAt(j) == 'e' || t.charAt(j) == 'i' || t.charAt(j) == 'o' || t.charAt(j) == 'u')
                    vowel++;
                else
                    consonant++;
            }
            if(consonant != 0 && vowel != 0){
                System.out.println(consonant + " " + vowel);
                consonant = 0;
                vowel = 0;
            }
        }
    }
}