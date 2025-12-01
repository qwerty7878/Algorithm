import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

        IntStream.range(0, 28).forEach(i -> list.add(sc.nextInt()));
        IntStream.rangeClosed(1, 30)
                .filter(i -> !list.contains(i))
                .forEach(System.out::println);
    }
}