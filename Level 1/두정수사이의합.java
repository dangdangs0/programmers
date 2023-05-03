class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum;
        if(a==b){
            return a;
        }
        else if(a>b){//a=5, b=3
            sum=0;
            for(int i=b;i<=a;i++){
                sum=sum+i;
            }
        }
        else{
            sum=0;
            for(int i=a;i<=b;i++){
                sum=sum+i;
            }
        }
        
        answer=sum;
        return answer;
    }
}
