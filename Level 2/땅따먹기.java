class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        //https://shanepark.tistory.com/183 참조!
        //DP
        //이전까지의 값 중 최대값을 아래쪽에 저장해나감
        for(int i=1;i<land.length;i++){
            //본인 열은 선택 못함
            land[i][0]+=Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][3]);
            land[i][1]+=Math.max(Math.max(land[i-1][0],land[i-1][2]),land[i-1][3]);
            land[i][2]+=Math.max(Math.max(land[i-1][1],land[i-1][0]),land[i-1][3]);
            land[i][3]+=Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][0]);
        }

        int max=0;
        for(int i=0;i<4;i++){
            if(max<land[land.length-1][i]){
                max=land[land.length-1][i];
            }
        }
        answer=max;
        return answer;
    }
    
}
