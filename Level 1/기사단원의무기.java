class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=0;i<number;i++){
            int count=divisor(i+1);
            
            if(count>limit){
                count=power;
            }
            answer+=count;
        }
        return answer;
    }
    
    public int divisor(int n){
        int count=1;
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
        
    }
}
