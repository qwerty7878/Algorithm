import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        int max = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long card = Long.parseLong(br.readLine());
            map.put(card, map.getOrDefault(card, 0) + 1);

            if (max < map.get(card)) {
                max = map.get(card);
                ans = card;
            } else if (max == map.get(card)) {
                ans = Math.min(ans, card);
            }
        }
        System.out.println(ans);
    }
}