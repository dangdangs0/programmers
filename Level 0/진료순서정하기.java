class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp=new int[emergency.length];
        int max=0;
        int rank=0;
        rank=emergency.length;
        
        for(int i=0;i<emergency.length;i++){
            temp[i]=emergency[i];
        }
        
        int empty=0;
        
        for(int i=0;i<temp.length;i++){
            for(int j=i;j<temp.length;j++){
                if(temp[j]>temp[i]){
                    empty=temp[j];
                    temp[j]=temp[i];
                    temp[i]=empty;
                }
            }
        }
        
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<emergency.length;j++){
                if(temp[i]==emergency[j]){
                    answer[j]=i+1;
                }
            }
        }
        
        return answer;
    }
}
