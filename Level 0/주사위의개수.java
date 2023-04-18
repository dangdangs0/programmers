class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int a,b,c;
        a=box[0]/n;
        b=box[1]/n;
        c=box[2]/n;
        
        answer=a*b*c;
        
        return answer;
    }
}
