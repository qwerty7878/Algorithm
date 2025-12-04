import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int roomCount = 1;
        int room = 1;
        while (true) {
            if (n <= room) {
                break;
            }
            room += 6 * roomCount;
            roomCount++;
        }
        System.out.println(roomCount);
    }
}