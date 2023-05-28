class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total=brown+yellow;
        int[] divisor=new int[total];
        boolean isLoop=true;
        
        int start=1;
        int count=0;
        while(start<=total){
            if(total%start==0){
                divisor[count]=start;
                count++;
            }
            if((double)total/start==start){
                divisor[count]=start;
                count++;
            }
            start++;
            
            if(start>total){
                break;
            }
        }
        
        if(count==2){
            answer[0]=total;
            answer[1]=1;
            return answer;
        }
        int horizon=divisor[count/2];
        int vertical=divisor[count/2-1];
        int plus=1;
        while(isLoop){
            int round=horizon*2+vertical*2-4;
            
            if(brown!=round){
                try{
                    horizon=divisor[count/2+plus];
                    vertical=divisor[count/2-1-plus];
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Here");
                }
                
            }
            else{
                break;
            }
            plus++;
        }
        
        answer[0]=horizon;
        answer[1]=vertical;
        
        return answer;
    }
}
