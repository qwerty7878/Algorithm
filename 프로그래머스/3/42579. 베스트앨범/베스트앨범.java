import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public static class melon{
        int idx;
        int play;

        public melon(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }
    }
    public static int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>(); //  
        
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            //  조건문과 유사
            //  디폴트 0으로 하고 조건에 맞다면 genres[i]에 play[i]를 더함
            //  아니면 디폴트 값에 더함
        }   

        ArrayList<String> list = new ArrayList<>();
        for(String s1 : map.keySet()){
            list.add(s1);
        }   //  리스트에 해시맵 키 값 옮김(장르)
        list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        for (String s2 : list){
            ArrayList<melon> musics = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if(s2.equals(genres[i])){
                    musics.add(new melon(i, plays[i]));
                }
            }

            musics.sort(new Comparator<melon>() {
                @Override
                public int compare(melon o1, melon o2) {
                    if(o1.play == o2.play){
                        return o1.idx - o2.idx;
                    }
                    return o2.play - o1.play;
                }   
            });//  람다식 정렬

            res.add(musics.get(0).idx);
            if(musics.size() != 1){
                res.add(musics.get(1).idx);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}