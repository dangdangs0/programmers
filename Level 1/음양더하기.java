class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(signs[i]){//양의 정수
                answer+=absolutes[i];
            }
            else{
                answer=answer+absolutes[i]*(-1);
            }
        }
        return answer;
    }
}
