class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int start=0;
        int begin=1;
        
        int right=0;
        int down=n-1;
        int left=n-1;
        int up=0;
        while(begin<=n*n){
            if(start%4==0){//오른쪽
                for(int i=0;i<n;i++){
                    if(answer[right][i]!=0){
                        continue;
                    }
                    else{//
                        answer[right][i]=begin;
                        begin++;
                    }
                }
                right++;//첫번째 행, 두번째 행,..으로 가려고
            }
            else if(start%4==1){//아래로
                for(int i=0;i<n;i++){
                    if(answer[i][down]!=0){
                        continue;
                    }
                    else{
                        answer[i][down]=begin;
                        begin++;
                    }
                }
                down--;//마지막열, 그 전 열, ...
            }
            else if(start%4==2){//왼쪽
                for(int i=n-1;i>=0;i--){
                    if(answer[left][i]!=0){
                        continue;
                    }
                    else{
                        answer[left][i]=begin;
                        begin++;
                    }
                }
                left--;
            }
            else if(start%4==3){//위로
                for(int i=n-1;i>=0;i--){
                    if(answer[i][up]!=0){
                        continue;
                    }
                    else{
                        answer[i][up]=begin;
                        begin++;
                    }
                }
                up++;
            }
            
            start++;
        }
        
        return answer;
    }
}
