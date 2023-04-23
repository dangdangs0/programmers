class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum=0;
        
        if(n%2==0){//짝수
            int count=2;
            while(count<=n){
                if(count%2==0){ //짝수인것들만
                    sum=sum+(int)Math.pow(count,2);
                }
                count++;
            }
        }
        else{//홀수
            int count=1;
            while(count<=n){
                if(count%2!=0){ //홀수인것들만
                    sum=sum+count;
                }
                count++;
            }
        }
        
        answer=sum;
        
        return answer;
    }
}
