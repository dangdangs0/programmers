class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int start=1;
        while(start<=n){
            int sum=0;
            int go=start;
            while(sum<=n){
                sum+=go;
                
                if(sum>=n){
                    if(sum==n){
                        answer++;
                    }
                    else{
                        break;
                    }
                }
                
                go++;
            }
            start++;
            if(start>n){
                break;
            }
        }
        return answer;
    }
}
