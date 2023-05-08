class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++){
            if(divisor(i)%2==0){//짝수
                answer+=i;
            }
            else{
                answer-=i;
            }
        }
        
        return answer;
    }
    
    public int divisor(int n){
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
}
