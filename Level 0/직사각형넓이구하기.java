class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minx=0, miny=0, maxx=0,maxy=0;
        
        minx=dots[0][0];
        miny=dots[0][1];
        maxx=dots[0][0];
        maxy=dots[0][1];
        
        for(int i=1;i<4;i++){
            if(minx>dots[i][0]){
                minx=dots[i][0];
            }
            if(miny>dots[i][1]){
                miny=dots[i][1];
            }
            if(maxx<dots[i][0]){
                maxx=dots[i][0];
            }
            if(maxy<dots[i][1]){
                maxy=dots[i][1];
            }
        }
        
        answer=(maxx-minx)*(maxy-miny);
        
        return answer;
    }
}
