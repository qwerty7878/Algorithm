import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int temp[];
    static int count = 0;
    static int k;
    static int ans = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int a[] = new int[n];
        temp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] =  Integer.parseInt(st.nextToken());
        }
        merge_sort(a, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        sb.append(ans);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void merge_sort(int[] a, int p, int r){
        if (p < r) {
            int q = (p + r) / 2;
//            전반부 정렬
            merge_sort(a, p, q);
//            후반부 정렬
            merge_sort(a, q + 1, r);
//            병합
            merge(a, p, q, r);
        }
    }

    public static void merge(int[] a, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r){
            if (a[i] <= a[j]) {
                temp[t++] = a[i++];
            } else {
                temp[t++] = a[j++];
            }
        }

//        왼쪽 배열부분이 남은 경우
        while (i <= q) {
            temp[t++] = a[i++];
        }
        
//        오른쪽 배열 부분이 남은 경우
        while (j <= r) {
            temp[t++] = a[j++];
        }

        i = p;
        t = 0;
//        결과물 저장
        while (i <= r) {
            count++;

            if  (count == k) {
                ans = temp[t];
                break;
            }

            a[i++] = temp[t++];
        }
    }
}