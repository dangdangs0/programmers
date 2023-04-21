class Solution {
    public int[] solution(int n) {
        int[] divisor=new int[10000];
        int count=0;
    
        int i=1;
        while(n>=i){
            if(n%i==0){//약수
                divisor[count]=i;
                count++;
            }
            i=i+1;
        }
        
        int[] answer = new int[count];
        
        for(int j=0;j<count;j++){
            answer[j]=divisor[j];
        }
        
        return answer;
    }
}
