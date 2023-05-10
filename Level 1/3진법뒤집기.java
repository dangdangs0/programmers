import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp="";
        if(n<=2){
            temp+=n;
        }
        while(n>=3){
            temp+=String.valueOf(n%3);
            n=n/3;
            if(n<3){
                temp+=n;
            }
        }
        
        int len=temp.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int tmp=temp.charAt(i)-'0';
            sum+=tmp*Math.pow(3,len-i-1);
        }
        answer=sum;
        return answer;
    }
}
