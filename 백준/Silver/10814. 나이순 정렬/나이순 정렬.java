import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Member m[] = new Member[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            m[i] = new Member(age, name);
        }

        Arrays.sort(m, new Comparator<Member>() {
            @Override
            public int compare(Member s1, Member s2) {
                return s1.age - s2.age;
            }
        });

        for(int i = 0; i < m.length; i++){
            sb.append(m[i]);
        }

        System.out.println(sb);
    }

    public static class Member {
        int age;
        String name;

        public Member(int age,String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}