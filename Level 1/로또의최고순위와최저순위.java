class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct=0;
        
        int len=lottos.length;
        
        int zero=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(win_nums[i]==lottos[j]){
                    correct++;
                    break;
                }
            }
        }
        for(int i=0;i<len;i++){
            if(lottos[i]==0){
                zero++;
            }
        }
        
        //최고 점수
        int first=correct+zero;
        if(first==6){
            answer[0]=1;
        }
        else if(first==5){
            answer[0]=2;
        }
        else if(first==4){
            answer[0]=3;
        }
        else if(first==3){
            answer[0]=4;
        }
        else if(first==2){
            answer[0]=5;
        }
        else{
            answer[0]=6;
        }
        
        //최저점수
        if(correct==6){
            answer[1]=1;
        }
        else if(correct==5){
            answer[1]=2;
        }
        else if(correct==4){
            answer[1]=3;
        }
        else if(correct==3){
            answer[1]=4;
        }
        else if(correct==2){
            answer[1]=5;
        }
        else{
            answer[1]=6;
        }
        
        return answer;
    }
}
