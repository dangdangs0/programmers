class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        boolean isLoop=true;
        
        while(isLoop){
            answer++;
            
            if(a>b){
                if(b%2!=0 && b+1==a){
                    isLoop=false;
                    break;
                }
                else{
                    a=nextInt(a);
                    b=nextInt(b);
                }
            }
            else{
                if(a%2!=0 && a+1==b){
                    isLoop=false;
                    break;
                }
                else{
                    a=nextInt(a);
                    b=nextInt(b);
                }
            }
            
            
        }

        return answer;
    }
    
    public static int nextInt(int n){
        int ret=0;
        if(n%2==0){
            int temp=n/2;//2
            ret=n-temp;//4-2는 2번째 참가자
        }
        else if(n%2!=0){
            int temp=(n+1)/2-1;//3
            ret=n-temp;
        }
        
        return ret;
    }
}
