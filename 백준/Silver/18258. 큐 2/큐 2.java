import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String command = (st.nextToken());
            if(command.equals("push"))
                queue.add(Integer.parseInt(st.nextToken()));
            else if(command.equals("pop"))
                sb.append(queue.isEmpty()?-1:queue.poll()).append('\n');
            else if(command.equals("size"))
                sb.append(queue.size()).append('\n');
            else if(command.equals("empty"))
                    sb.append(queue.isEmpty()?1:0).append('\n');
            else if(command.equals("front"))
                sb.append(queue.isEmpty()?-1:queue.peekFirst()).append('\n');
            else if(command.equals("back"))
                sb.append(queue.isEmpty()?-1:queue.peekLast()).append('\n');
        }
        System.out.println(sb);
    }
}