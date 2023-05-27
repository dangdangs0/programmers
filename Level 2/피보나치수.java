class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] result=new int[n+1];
        result[0]=0;
        result[1]=1;
        
        for(int i=2;i<=n;i++){
            result[i]=(result[i-2]+result[i-1])%1234567;
        }
        answer=result[n];
        
        return answer;
    }
    
}
