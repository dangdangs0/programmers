class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer=isnum(n);     
        return answer;
    }
    public int isnum(int n){
        int num;
        if(n==1){
            return 1;
        }
        else{
            num=isnum(n-1)+1;
        }
        while(num%3==0 || String.valueOf(num).contains("3")){
            num=num+1;
        }
        
        return num;
    }
    
}
