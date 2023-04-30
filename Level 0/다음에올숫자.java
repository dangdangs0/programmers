class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len=common.length;
        if(common[1]-common[0]==common[2]-common[1]){//등차수열
            int gap=common[1]-common[0];
            answer=common[len-1]+gap;
        }
        else if((double)(common[1]/common[0])==(double)(common[2]/common[1])){//등비수열
            int gop=common[1]/common[0];
            answer=common[len-1]*gop;
        }
        return answer;
    }
}
