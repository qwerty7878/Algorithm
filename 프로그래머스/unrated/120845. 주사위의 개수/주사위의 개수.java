class Solution {
    public int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
        // 길이/n은 길이에 들어갈 수 있는 갯수임으로 육면체기때문에 가로 세로 높이 3개를 곱해줘야함
    }
}