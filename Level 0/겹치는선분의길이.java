class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] exist=new int[201];
        
        for(int i=0;i<3;i++){
            for(int j=lines[i][0]+1;j<=lines[i][1];j++){
                if(j<0){//j가 음수이면
                    exist[Math.abs(j)+100]+=1;
                }
                else{
                    exist[j]+=1;
                }
            }
        }
        
        for(int i=0;i<=200;i++){
            if(exist[i]>=2){
                answer++;
            }
        }
        return answer;
    }
}
