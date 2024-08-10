import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char arr[][];
    static boolean visited[][];
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        visited = new boolean[n][n];

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        int redgreencnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j]) {
                    dfs(i,j);
                    redgreencnt++;
                }
                if(arr[i][j] == 'G') {    //    초록색 빨간색 구분 못하니 바꿔주기
                    arr[i][j] = 'R';
                }
            }
        }
        sb.append(redgreencnt).append(" ");

        int isredgreencnt = 0;
        visited = new boolean[n][n];    //    현재 visit울 다시 방문유무를 확인하기 위해 새로 만들기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    isredgreencnt++;
                }
            }
        }
        sb.append(isredgreencnt);
        System.out.println(sb.toString());
    }

    static void dfs(int x,int y){
        visited[x][y] = true;
        char temp = arr[x][y];

        for(int i = 0; i < 4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                if(!visited[nx][ny] && arr[nx][ny] == temp){
                    dfs(nx,ny);
                }
            }
        }
    }
}

