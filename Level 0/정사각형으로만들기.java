class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int a=arr[0].length;//3
        int b=arr.length;//4
        
        if(a>b){//a=4, b=2
            answer=new int [a][a];
            for(int i=0;i<a;i++){
                if(i>=b){
                    for(int j=0;j<a;j++){
                        answer[i][j]=0;
                    }
                }
                else{
                    for(int j=0;j<a;j++){
                        answer[i][j]=arr[i][j];
                    }
                }
            }
        }
        else if(a<b){//a=3, b=4
            answer=new int [b][b];
            for(int i=0;i<b;i++){
                for(int j=0;j<b;j++){
                    if(j>=a){
                        answer[i][j]=0;
                    }
                    else{
                        answer[i][j]=arr[i][j];
                    }
                }
            }
        }
        else{
            answer=arr;
        }
        return answer;
    }
}
