class Solution {
    public int GCD(int a, int b){
        if(a%b==0){
            return b;
        }
        return GCD(b,a%b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int top=0, under=0;
        int anstop=0, ansun=0;
        
        if(denom1==denom2){
            under=denom1;
            top=numer1+numer2;
        }
        else if(denom1%denom2==0){
            under=denom1;
            top=numer1+denom1/denom2*numer2;
        }
        else if(denom2%denom1==0){
            under=denom2;
            top=numer2+denom2/denom1*numer1;
        }
        else{
            under=denom1*denom2;
            top=numer1*denom2+numer2*denom1;
        }
        
        anstop=top/GCD(top,under);
        ansun=under/GCD(top,under);
        answer[0]=anstop;
        answer[1]=ansun;
        return answer;
    }
    
    
}
