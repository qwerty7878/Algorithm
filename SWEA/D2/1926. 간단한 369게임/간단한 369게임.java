import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = "" + (i + 1);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i].contains("3") || arr[i].contains("6") || arr[i].contains("9")) {
                arr[i] = arr[i].replaceAll("3", "-");
                arr[i] = arr[i].replaceAll("6", "-");
                arr[i] = arr[i].replaceAll("9", "-");

                arr[i] = arr[i].replaceAll("1", "");
                arr[i] = arr[i].replaceAll("2", "");
                arr[i] = arr[i].replaceAll("4", "");
                arr[i] = arr[i].replaceAll("5", "");
                arr[i] = arr[i].replaceAll("7", "");
                arr[i] = arr[i].replaceAll("8", "");
                arr[i] = arr[i].replaceAll("0", "");
            }
            System.out.print(arr[i] + " ");
        }
    }
}