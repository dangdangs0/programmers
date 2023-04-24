class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a=sides[0];
        int b=sides[1];
        
        int n=1;
        int max=0;
        int count=0;
        
        //둘중 하나가 제일 긴 변일 때
        if(a>b){
            max=a;
            count=0;
            n=1;
            while(n<=a){
                if(a<b+n){
                    count++;
                }
                n++;
            }
            answer=answer+count;
        }
        else if(a<b){
            max=b;
            count=0;
            n=1;
            while(n<=b){
                if(b<a+n){
                    count++;
                }
                n++;
            }
            answer=answer+count;
        }
        
        //나머지 한 변이 가장 긴 변일때
        count=1;
        n=max+1; //a나 b 둘중 가장 긴 변보다 길어야 입력값이 가장 긴 변
        while(a+b>n){
            answer=answer+count;
            n++;
        }
        
        return answer;
    }
}
