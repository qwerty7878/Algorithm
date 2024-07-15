import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String example[] = new String[n];

        for (int i = 0; i < n; i++) {
            example[i] = br.readLine();
        }

        String whiteboard[] = new String[8];
        String blackboard[] = new String[8];

        for (int i = 0; i < 8; i++) {   //  검은 보드
            if (i % 2 == 0) {
                blackboard[i] = "BWBWBWBW";
            } else {
                blackboard[i] = "WBWBWBWB";
            }
        }

        for (int i = 0; i < 8; i++) {   //  흰 보드
            if (i % 2 == 0) {
                whiteboard[i] = "WBWBWBWB";
            } else {
                whiteboard[i] = "BWBWBWBW";
            }
        }

        int min = 64;
        for (int i = 0; i < (n - 7); i++) {
            for (int j = 0; j < (m - 7); j++) {
                int wcnt = 0;
                int bcnt = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (whiteboard[k].charAt(l) != example[k + i].charAt(l + j)) {
                            wcnt++;
                        }
                        if (blackboard[k].charAt(l) != example[k + i].charAt(l + j)) {
                            bcnt++;
                        }
                    }
                }
                min = Math.min(min,Math.min(wcnt, bcnt));
            }
        }

        System.out.println(min);
    }
}