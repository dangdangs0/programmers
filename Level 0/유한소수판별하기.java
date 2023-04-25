class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int count=0;
        int[] temp=new int[1000];
        int yaksu=0;
        
        if(b==1 || a%b==0){
            answer=1;
        }
        else{
            //기약분수
            for(int k=1;k<=a && k<=b;k++){
                if(a%k==0 && b%k==0){
                    yaksu=k;
                }
            }
            if(yaksu!=0){
                try{
                    a=a/yaksu;
                    b=b/yaksu;
                }
                catch(ArithmeticException e){
                    
                }
                
            }
            
            //소인수
            int i=2;
            int divisor=b;
            while(divisor!=1){
                if(divisor%i==0){
                    temp[count]=i;
                    count++;
                    divisor=divisor/i;
                    i=2;           
                }
                else{
                    i=i+1;
                }
            }
            
            for(int j=0;j<count;j++){
                if(temp[j]==2 || temp[j]==5){
                    answer=1;
                    
                }
                else{
                    answer=2;
                    break;
                }
            }
        }
        
        return answer;
    }
}
