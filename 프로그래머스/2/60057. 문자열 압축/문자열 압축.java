class Solution {
    public int solution(String s) {
        int answer = s.length();    //  초기값

        for(int i = 1; i <= s.length()/2; i++){
            //  나눌 문자 갯수 1개 a 2개 aa 3개 aaa 4개 aaaa 이렇게
            //  나누는 경우가 5개가 되는 순간 1번 조건이 넘어감(1번은 문장길이가 8임)
            String str = "";    //  결과가 될 단어(cnt + 압축)
            String zip = "";    //  비교 후 압축 할 단어
            int cnt = 1;
            for(int j = 0; j < s.length()/i; j++){
                //  문장 길이만큼 반복 후 같은 경우 카운팅
                if(zip.equals(s.substring((j * i), (j * i)+ i))){
                    //  이전 단어와 같다면 카운팅
                    cnt++;
                    continue;
                }

                if(cnt > 1){    //  1 이상인 경우 카운팅 증가
                    str += cnt + zip;
                    cnt = 1;    //  다음 비교할 단어는 새로 카운팅해야하니 초기화
                }
                else{
                    str += zip;
                }
                zip = s.substring((j * i), (j * i)+ i);
                //  다음 값과 비교하도록 저장
                //  위에 있으면 if 처리가 나중에 되기 때문에 같은 zip으로 비교가됨
            }

            //  마지막 나눠진 애들 중에 자투리 처리
            if(cnt > 1){    //  1 이상인 경우 카운팅 증가
                str += cnt + zip;
                cnt = 1;    //  다음 비교할 단어는 새로 카운팅해야하니 초기화
            }
            else{
                str += zip;
            }
            if(s.length() % i != 0){    //  안나눠진 애들 처리
                str += s.substring(s.length() - s.length() % i,s.length());
            }
            answer = Math.min(str.length(), answer);
        }
        return answer;    //  최소값 출력
    }
}