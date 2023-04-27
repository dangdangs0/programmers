class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] temp=new int[10000];
        int[] sameDistance=new int[10000];
        
        for(int i=0;i<numlist.length;i++){
            int distance=Math.abs(n-numlist[i]);
            if(temp[distance]==0){
                temp[distance]=numlist[i];
            }
            else{
                if(temp[distance]>numlist[i]){
                    sameDistance[distance]=numlist[i];
                }
                else{
                    sameDistance[distance]=temp[distance];
                    temp[distance]=numlist[i];
                }
            }
        }
        
        int count=0;
        for(int i=0;i<10000;i++){
            if(temp[i]!=0){ //차이가 제일 적은것부터
                answer[count]=temp[i];
                count++;
            }
            if(sameDistance[i]!=0){
                answer[count]=sameDistance[i];
                count++;
            }
        }
        
        
        return answer;
    }
}
