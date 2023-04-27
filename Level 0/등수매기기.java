class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg=new double[score.length];
        boolean isSame=false;
        
        for(int i=0;i<score.length;i++){
            avg[i]=(double)(score[i][0]+score[i][1])/2;
        }
        
        int rank=1;
        int same=0;
        for(int i=0;i<avg.length;i++){
            for(int j=0;j<avg.length;j++){
                if(avg[j]==avg[i] && i==j){
                    continue;
                }
                else if(avg[j]==avg[i] && i!=j){
                    same++;
                    isSame=true;
                    
                }
                else if(avg[i]<avg[j]){
                    rank++;
                }
            }
            if(isSame){
                for(int k=0;k<i;k++){
                    if(answer[k]==rank+1){ //동등순위인데 바로 다음 순위가 있다면
                        answer[k]+=same;
                    }
                }
                isSame=false;
            }
            same=0;
            answer[i]=rank;
            rank=1;
        }
        return answer;
    }
}
