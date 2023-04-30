import java.util.Arrays;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        boolean isLoop=true;
        if(total==0){ //num/2 *(-1)부터
            int start=num/2*(-1);
            for(int i=0;i<num;i++){
                answer[i]=start;
                start++;
            }
        }
        else if(num==total){
            int start=num;
            int nowstart=0;
            while(isLoop){
                int sum=0;
                nowstart=start;
                for(int i=0;i<num;i++){
                    sum+=start;
                    start--;
                }
                if(sum==num){
                    isLoop=false;
                    break;
                }
                start=nowstart-1;
            }
            start=nowstart;
            for(int i=0;i<num;i++){
                answer[i]=start;
                start--;
            }
        }
        else if(num<total){ //0부터 카운트?
            int start=0;
            int nowstart=0;
            while(isLoop){
                int sum=0;
                nowstart=start;
                for(int i=0;i<num;i++){
                    sum+=start;
                    start++;
                }
                
                if(sum==total){
                    isLoop=false;
                    break;
                }
                start=nowstart+1;
            }
            start=nowstart;
            for(int i=0;i<num;i++){
                answer[i]=start;
                start++;
            }
        }
        else if(num>total){
            int start=num;
            int nowstart=0;
            while(isLoop){
                int sum=0;
                nowstart=start;
                for(int i=0;i<num;i++){
                    sum+=start;
                    start--;
                }
                if(sum==total){
                    isLoop=false;
                    break;
                }
                start=nowstart-1;
            }
            start=nowstart;
            for(int i=0;i<num;i++){
                answer[i]=start;
                start--;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
