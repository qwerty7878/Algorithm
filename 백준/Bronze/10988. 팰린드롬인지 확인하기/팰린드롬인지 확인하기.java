import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String PalindromeWord = reverseWord(word);
        if (isPalindrome(word, PalindromeWord)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean isPalindrome(String word, String palindromeWord) {
        if (word.equals(palindromeWord)) {
            return true;
        }else  {
            return false;
        }
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}