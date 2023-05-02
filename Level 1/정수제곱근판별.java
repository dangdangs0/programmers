import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if(Math.sqrt(n)%1==0.0){//0.0으로 떨어지면 양의정수지,,
            long temp=(long)Math.sqrt(n);
            answer=(long)Math.pow(temp+1,2);
               
        }
        else{
            answer=-1;
        }
        return answer;
    }
}
