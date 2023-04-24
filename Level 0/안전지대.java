class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int size=board[0].length;
        int[][] danger=new int[size][size];
        int not0=0;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==1){//지뢰
                    danger[i][j]=1;
                    if(j-1>=0){
                        danger[i][j-1]=1;
                    }
                    if(j+1<size){
                        danger[i][j+1]=1;
                    }
                    if(i-1>=0){
                        danger[i-1][j]=1;
                        
                        if(j-1>=0){
                            danger[i-1][j-1]=1;
                        }
                        if(j+1<size){
                            danger[i-1][j+1]=1;
                        }
                    }
                    if(i+1<size){
                        danger[i+1][j]=1;
                        
                        if(j-1>=0){
                            danger[i+1][j-1]=1;
                        }
                        if(j+1<size){
                            danger[i+1][j+1]=1;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(danger[i][j]==1){
                    not0++;
                }
            }
        }
        answer=size*size-not0;
        return answer;
    }
}
