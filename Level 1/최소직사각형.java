class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){//swap
                int temp=sizes[i][1];
                sizes[i][1]=sizes[i][0];
                sizes[i][0]=temp;
            }
        }
        
        int maxr=sizes[0][1];
        int maxl=sizes[0][0];
        
        for(int i=1;i<sizes.length;i++){
            if(maxr<sizes[i][1]){
                maxr=sizes[i][1];
            }
            if(maxl<sizes[i][0]){
                maxl=sizes[i][0];
            }
        }
        
        answer=maxr*maxl;
        return answer;
    }
}
