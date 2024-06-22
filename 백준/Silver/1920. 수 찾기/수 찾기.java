import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int m = Integer.parseInt(br.readLine());
        int arr[] = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int searchKey = Integer.parseInt(st.nextToken());
            if (BinarySearch(arr, searchKey) >= 0) {
//                Arrays.binarySearch(arr,searchKey) >= 0 으로 대체가능
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    static int BinarySearch(int arr[],int searchKey) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;

            if (arr[mid] < searchKey) {
                low = mid + 1;
            } else if (arr[mid] > searchKey) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return  -1;
    }
}