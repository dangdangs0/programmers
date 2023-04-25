class Solution {
    public int[] solution(int n) {
        int[] temp=new int[1000];
        int count=0;
        
        while(n!=1){
            temp[count]=n;
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            count++;
        }
        
        int[] answer = new int[count+1];
        for(int i=0;i<count+1;i++){
            answer[i]=temp[i];
        }
        
        answer[count]=1;
        return answer;
    }
}
