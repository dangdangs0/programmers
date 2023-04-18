class Solution {
    public int solution(int n) {
        int answer = 0;
        int count=0;
        
        while(n!=0){
            count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count>2){
                answer++;
            }
            n=n-1;
        }
        
        return answer;
    }
}
