class Solution {
    public int solution(int n) {
        int answer=0;
        int i=0;
        int near1=0;
        int near2=0;
        boolean forRoop=true;
        
        while(forRoop){
            i=i+1;
            near1 = fact(i);
            near2=fact(i+1);
            
            if(near1<=n && n<=near2){
                forRoop=false;
            }
        }
        
        if(near2==n){
            answer=i+1;
        }
        else{
            answer=i;
        }
        
        return answer;
    }
    
    public static int fact(int n){
        int count=0;
        if(n==1){
            count=1;
        }
        else{
            count=n*fact(n-1);
        }
        return count;
    }
}
