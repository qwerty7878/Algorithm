import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();

        Set<Character> words = new HashSet<>();
        for (char c : input.toCharArray()) {
            words.add(c);
        }
        
        int alphaCount[] = new int[words.size()];
        List<Character> alphabet = new ArrayList<>(words);

        for (int i = 0; i < alphaCount.length; i++) {
            for  (int j = 0; j < input.length(); j++) {
                if (alphabet.get(i) == input.charAt(j)) {
                    alphaCount[i]++;
                }
            }
        }

        int max = 0;
        int maxIndex = 0;
        boolean isEqual = false;
        for (int i = 0; i < alphaCount.length; i++) {
            if (alphaCount[i] > max) {
                max = alphaCount[i];
                maxIndex = i;
                isEqual = false;
            }else if (alphaCount[i] == max) {
                isEqual = true;
            }
        }

        if (!isEqual) {
            System.out.println(alphabet.get(maxIndex));
        }else  {
            System.out.println("?");
        }
    }
}